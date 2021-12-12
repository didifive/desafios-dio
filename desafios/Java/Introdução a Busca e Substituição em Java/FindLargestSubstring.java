/*
====================================================
Introdução a Busca e Substituição em Java
====================================================
2/5 - Encontre a maior substring
====================================================

Desafio
Encontre a maior substring comum entre as duas strings informadas. A substring pode ser qualquer parte da string, inclusive ela toda. Se não houver subseqüência comum, a saída deve ser “0”. A comparação é case sensitive ('x' != 'X').

Entrada
A entrada contém vários casos de teste. Cada caso de teste é composto por duas linhas, cada uma contendo uma string. Ambas strings de entrada contém entre 1 e 50 caracteres ('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').

Saída
O tamanho da maior subsequência comum entre as duas Strings.

---------------------------------------------
| Exemplo de Entrada     | Exemplo de Saída |
---------------------------------------------
| abcdef                 | 2                |
| cdofhij                | 1                |
| TWO                    | 0                |
| FOUR                   | 7                |
| abracadabra            |                  |
| open                   |                  |
| Hey This java is hot   |                  |
| Java is a new paradigm |                  |
---------------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FindLargestSubstring {

  static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) throws IOException {
    String first, max, min, second;
    while ((first = read()) != null) {
      second = read();
      if (first.length() > second.length()){
        max = first;
        min = second;
      } else {
        max = second;
        min = first;
      }
      int minLength = min.length();
      int maxS = minLength;
      boolean f = true;
      while (maxS > 0 && f) {
        int diff = minLength - maxS;
        for (int i=0; i<=diff ; i++) { 
          if (max.contains(min.substring(i, i + maxS))) {
            f = false;
            maxS++;
            break;
          }
        }
        maxS--;
      }
      System.out.println(maxS);
    }
    in.close();
    out.close();
  }

  private static String read() throws IOException {
      return in.readLine();
  }
}