/*
====================================================
Introdução a Busca e Substituição em Java
====================================================
1/5 - Ordenação de palavras por tamanho
====================================================

Desafio
Crie um algoritmo para ordenar um conjunto de palavras pelo seu tamanho. Seu programa deve receber um conjunto de palavras e retornar este mesmo conjunto ordenado pelo tamanho das palavras decrescente, se o tamanho das palavras for igual, deve-se ordernar por ordem alfabética.

Entrada
A primeira linha da entrada possui um único inteiro N, que indica o número de casos de teste. Cada caso de teste poderá conter de 1 a 50 palavras inclusive, e cada uma das palavras poderá conter entre 1 e 50 caracteres inclusive. Os caracteres poderão ser espaços, letras, ou números.

Saída
A saída deve conter o conjunto de palavras da entrada ordenado pelo tamanho das palavras e caso o tamanho das palavras for igual, deve-se ordernar por ordem alfabética.. Um espaço em branco deve ser impresso entre duas palavras.

---------------------------------------------------------------------
| Exemplo de Entrada              | Exemplo de Saída                |
---------------------------------------------------------------------
| 2                               | midnight three four mond One at |
| One three four mond at midnight | three five one                  |
| one three five                  |                                 |
---------------------------------------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordOrderBySize {
  
  static Scanner in = new Scanner(System.in);
  static PrintWriter out = new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException {
    int tests = toInt(read());
    for (int i=0; i<tests; i++) {
      String words = Arrays.asList(
        read().split(" ")
      ).stream()
        .sorted(new Comparator<String>() {
          @Override
          public int compare(String w1, String w2) {
            int diff = w2.length() - w1.length();
            if (diff != 0) return diff;
            int alfabetical = w1.compareToIgnoreCase(w2);
            if (alfabetical != 0) return alfabetical;
            return 0;
          }
        })
        .collect(Collectors.joining(" "));

        out.println(words);
        out.flush();
      }
    in.close();
    out.close();
  }
  private static String read() throws IOException {
    return in.nextLine();
  }

  private static int toInt(String s) {
      return Integer.parseInt(s);
  }
}