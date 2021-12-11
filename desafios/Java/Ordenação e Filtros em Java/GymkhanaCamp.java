/*
====================================================
Fundamentos Aritméticos em Java
====================================================
5/5 - Gincana no Acampamento
====================================================

Desafio
Nas férias de Dezembro, várias escolas se organizam e levam seus alunos para um acampamento de férias por uma semana. Nestes acampamentos os alunos são divididos em cabanas coletivos por gênero e idade, sempre com um adulto que, além de dormir com o grupo no cabana, também são responsáveis por criar e executar várias atividades, como por exemplo jogos, excursões, Gincanas Noturnas, etc.
No primeiro dia foi realizada uma gincana em que a atividade constituia em agrupar os alunos em um círculo (organizado no sentido anti-horário) do qual seriam retiradas uma a uma até que sobrasse apenas um aluno, que seria o vencedor.
No momento em que entra no círculo, cada aluno recebe uma pequena ficha que contém um valor de 1 a 500. Depois que o círculo é formado, conta-se, iniciando no aluno que está ao lado da primeira que entrou no círculo, o número correspondente à ficha que o primeiro detém. O aluno onde o número contado cair, deve ser retirado do grupo, e a contagem inicia novamente segundo a ficha do aluno que acabou de ser eliminado. Para ficar mais interessante, quando o valor que consta na ficha é par, a contagem é feita no sentido horário e quando o valor que consta na ficha é ímpar, a contagem é feita no sentido anti-horário.
Desenvolva um programa para que no próximo evento o responsável pela brincadeira saiba previamente qual criança irá ser a vencedora de cada grupo, com base nas informações fornecidas.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém um inteiro N (1 ≤ N ≤ 100), indicando a quantidade de alunos que farão parte de cada círculo. Em seguida, as N linhas de cada caso de teste conterão duas informações, o Nome e o Valor (1 ≤ Valor ≤ 500) que consta na ficha de cada aluno, separados por um espaço, na ordem de entrada na formação do círculo inicial.
OBS: O Nome de cada aluno não deverá ultrapassar 30 caracteres e contém apenas letras maiúsculas e minúsculas, sem acentos, e o caractere “_”. O final da entrada é indicado pelo número zero.

Saída
Para cada caso de teste, deve-se apresentar a mensagem Vencedor(a): xxxxxx, com um espaço após o sinal ":" indicando qual é o aluno do grupo que venceu a brincadeira.

------------------------------------------------------
| Exemplo de Entrada | Exemplo de Saída              |
------------------------------------------------------
| 3                  | Vencedor(a): Fernanda         |
| Fernanda 7         | Vencedor(a): Pedro            |
| Fernando 9         | Vencedor(a): Pedro            |
| Gustavo 11         |                               |
| 5                  |                               |
| Maria 7            |                               |
| Pedro 9            |                               |
| Joao_Vitor 5       |                               |
| Isabel 12          |                               |
| Laura 8            |                               |
| 3                  |                               |
| Maria 4            |                               |
| Pedro 3            |                               |
| Joao 2             |                               |
| 0                  |                               |
------------------------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GymkhanaCamp {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    List<Student> studentsCircle = new ArrayList<>();
    int actualStudentIndex, circleSize, eliminatedStudentIndex, studentToken;
    Integer actualToken, numberStudents;
    String studentName;
    Student student;

    numberStudents = sc.nextInt();

    while (!numberStudents.equals(0)) {
      for (int i=0; i<Math.abs(numberStudents); i++) {
        studentName = sc.next();
        studentToken = sc.nextInt();
        studentsCircle.add(new Student(studentName,studentToken));
      }
      
      actualStudentIndex = 0;
      eliminatedStudentIndex = 0;
      student = studentsCircle.get(actualStudentIndex);
      actualToken = student.getToken();
      circleSize = studentsCircle.size();

      for (int j=0; j<(numberStudents-1); j++) {
        
        if (actualToken == 0) eliminatedStudentIndex = actualStudentIndex;
        else if (actualToken % 2 == 0) eliminatedStudentIndex = (circleSize - (actualToken % circleSize) + actualStudentIndex) % circleSize;
        else eliminatedStudentIndex = (actualToken % circleSize + actualStudentIndex) % circleSize;

        student = studentsCircle.get(eliminatedStudentIndex);
        actualToken = student.getToken();
        studentsCircle.remove(eliminatedStudentIndex);
        circleSize = studentsCircle.size();

        actualStudentIndex = (actualToken % 2 == 0) ?
                ((eliminatedStudentIndex <= (circleSize-1)) ? eliminatedStudentIndex : 0):
                ((eliminatedStudentIndex == 0) ? (circleSize-1):(eliminatedStudentIndex-1));
      }
      student = studentsCircle.get(0);

      System.out.println("Vencedor(a): " + student.getName());

      studentsCircle.clear();
      numberStudents = sc.nextInt();
    }
    sc.close();
  }
}

final class Student {

  private String name;
  private int token;

  public Student(String name, int token) {
      this.name = name;
      this.token = token;
  }

  public String getName() { return name; }

  public int getToken() { return token; }
}