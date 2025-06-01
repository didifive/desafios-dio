/*
============================================================================
Explorando Programação Orientada a Objetos e Estruturas de Dados com Java
============================================================================
2/2 - Classificação de Candidatos por Pontuação Técnica
============================================================================

Desafio
Um recrutador atribui uma pontuação técnica para cada candidato em um processo seletivo. Você deve criar um programa que classifica os candidatos da maior para a menor pontuação e exibe seus nomes nessa ordem.

Entrada
A entrada deve receber:

Um número inteiro N representando o número de candidatos.
Para cada candidato: o nome e a pontuação técnica (inteiro de 0 a 100), separados por vírgula.

Saída
Deverá retornar os nomes dos candidatos, ordenados da maior para a menor pontuação, um por linha. Se dois candidatos tiverem a mesma pontuação, o nome deve aparecer em ordem alfabética.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.
-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 3                  | Bruno            |
| Ana,85             | Ana              |
| Bruno,90           | Clara            |
| Clara,75           |                  |
-----------------------------------------
| 2                  | Julia            |
| Pedro,95           | Pedro            |
| Julia,95           |                  |
-----------------------------------------
| 1                  | Mario            |
| Mario,60	         |                  |
-----------------------------------------

Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

SOLUÇÃO ABAIXO:
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.lang.Comparable;

public class ClassificacaoCandidatos {

    static class Candidato implements Comparable<Candidato>{
        String nome;
        int pontuacao;

        Candidato(String nome, int pontuacao) {
            this.nome = nome;
            this.pontuacao = pontuacao;
        }
        
        @Override
        public String toString() {
            return this.nome;
        }
        
        @Override
        public int compareTo(Candidato o) {
            return (this.pontuacao == o.pontuacao) 
                ? this.nome.compareTo(o.nome) 
                : Integer.compare(o.pontuacao, this.pontuacao);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

          int n = Integer.parseInt(scanner.nextLine().trim());
          List<Candidato> candidatos = new ArrayList<>(n);
  
          for (int i = 0; i < n; i++) {
              String[] partes = scanner.nextLine().trim().split(",");
              candidatos.add(new Candidato(partes[0], Integer.parseInt(partes[1])));
          }
          
          Collections.sort(candidatos); // Ordenação mais eficiente

          candidatos.forEach(System.out::println); 
          
        }
    }
}