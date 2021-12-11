/*
====================================================
Ordenação e Filtros em Java
====================================================
1/5 - Ordenando Números Pares e Ímpares
====================================================

Desafio
Crie um programa onde você receberá valores inteiros não negativos como entrada.

Ordene estes valores de acordo com o seguinte critério:
Primeiro os Pares
Depois os Ímpares
Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000) Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.

Saída
Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 10                 | 4                |
| 4                  | 32               |
| 32                 | 34               |
| 34                 | 98               |
| 543                | 654              |
| 3456               | 3456             |
| 654                | 6789             |
| 567                | 567              |
| 87                 | 543              |
| 6789               | 87               |
| 98                 |                  |
-----------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortingEvenOddNumbers{
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int tests = sc.nextInt();
    List<Integer> listNumbers = new ArrayList<Integer>();
    for (int i=0;i<tests;i++)
      listNumbers.add(sc.nextInt());
    listNumbers.stream()
          .filter(n->n%2==0)
          .sorted()
          .forEach(System.out::println);
    listNumbers.stream()
          .filter(n->n%2!=0)
          .sorted(Comparator.reverseOrder())
          .forEach(System.out::println);
    sc.close();
  }
}