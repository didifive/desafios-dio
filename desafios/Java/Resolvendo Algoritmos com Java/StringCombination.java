/*
====================================================
Resolvendo Algoritmos com Java
====================================================
3/5 - Combinação de strings
====================================================

Desafio
Crie um algoritmo que receba dois inputs que sejam strings e combine-as alternando as letras de cada string. 
Deve começar pela primeira letra da primeira string, seguido pela primeira letra da segunda string, em seguida pela segunda letra da primeira string e continuar dessa forma sucessivamente.
As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada.

Entrada
A entrada contém vários casos de teste. A primeira linha contém um inteiro N que indica a quantidade de casos de teste que vem a seguir. Cada caso de teste é composto por uma linha que contém duas cadeias de caracteres, cada cadeia de caracteres contém entre 1 e 50 caracteres inclusive.

Saída
Combine as duas cadeias de caracteres da entrada como mostrado no exemplo abaixo e exiba a cadeia resultante.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 2                  | aBAb             |
| aA Bb              | abab             |
| aa bb              |                  |
-----------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class StringCombination {
    
  public static void main(String[] args) throws IOException {
      
    Scanner sc = new Scanner(System.in);
    int tests = Integer.parseInt(sc.nextLine());         
    
    for(int i = 1; i <= tests; i++) {
      StringBuilder result = new StringBuilder();
      String[] words = sc.nextLine().split(" ");
  
      int maxSize = Math.max (     
        words[0].length(),
        words[1].length()
      );
      
      for(int data = 0; data < maxSize; data++) {
        if(data < words[0].length())
          result.append(words[0].charAt(data));
        if(data < words[1].length())
          result.append(words[1].charAt(data));
      }
      System.out.println(result.toString());
    }

    sc.close();  
  }

}