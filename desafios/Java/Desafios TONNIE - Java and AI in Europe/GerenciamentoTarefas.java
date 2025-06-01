/*
==============================================
Explorando Organização e Gestão com Java
==============================================
2/2 - Gerenciamento de Lista de Tarefas
==============================================

Descrição
Você deve criar um programa que receba uma lista de tarefas a serem feitas durante o dia. Cada tarefa possui um nome e uma prioridade (número inteiro). Ordene as tarefas pela prioridade crescente e imprima a lista organizada.

Entrada
A entrada receberá um número N, representando a quantidade de tarefas, seguido de N linhas, cada uma contendo o nome da tarefa e a prioridade separados por vírgula.

Um número inteiro N (quantidade de tarefas).
N linhas contendo "nome da tarefa,prioridade".

Saída
Deverá retornar a lista de tarefas ordenada pela prioridade em ordem crescente, uma por linha, no formato: tarefa - prioridade.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.
------------------------------------------
| Exemplo de Entrada | Exemplo de Saída  |
------------------------------------------
| 3                  | Estudar Java - 1  |
| Estudar Java, 1    | Pausa Cafe - 2    |
| Reuniao Tech, 3    | Reuniao Tech - 3  |
| Pausa Cafe, 2      |                   |
------------------------------------------
| 4                  | Validar Codigos,1 |
| Enviar Emails, 2   | Enviar Emails, 2  |
| Almoco, 3          | Almoco, 3         |
| Validar Codigos,1  | Exercicios, 4     |
| Exercicios, 4      |                   |
------------------------------------------
| 2                  | Ler, 1            |
| Comprar Livros, 2  | Comprar Livros, 2 |
| Ler, 1             |                   |
------------------------------------------

Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

SOLUÇÃO ABAIXO:
*/

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.lang.Comparable;

public class GerenciamentoTarefas {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          int n = Integer.parseInt(sc.nextLine().trim());
          
          Set<Tarefa> tarefas = new TreeSet<>();
          
          for(int i = 0; i < n; i++) {
            String[] split = sc.nextLine().split(",");
            String nomeTarefa = split[0].trim();
            int prioridadeTarefa = Integer.parseInt(split[1].trim());
            
            tarefas.add(new Tarefa(nomeTarefa, prioridadeTarefa));
          }
          
          tarefas.forEach(System.out::println);
        }
    }

    static class Tarefa implements Comparable<Tarefa> {
        String nome;
        int prioridade;

        public Tarefa(String nome, int prioridade) {
            this.nome = nome;
            this.prioridade = prioridade;
        }
        
        @Override
        public String toString() {
          return String.format("%s - %d", nome, prioridade);
        } 

        @Override
        public int compareTo(Tarefa o) {
          return Integer.compare(this.prioridade, o.prioridade);
        }
    }
}