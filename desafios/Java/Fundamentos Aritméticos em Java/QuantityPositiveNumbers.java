/*
====================================================
Fundamentos Aritméticos em Java
====================================================
1/5 - Quantidade de Números Positivos
====================================================

Desafio
Crie um programa que leia 6 valores, os quais poderão ser negativos e/ou positivos. Em seguida, apresente a quantidade de valores positivos digitados.

Entrada
Você receberá seis valores, negativos e/ou positivos.

Saída
Exiba uma mensagem dizendo quantos valores positivos foram lidos. assim como é exibido abaixo no exemplo de saída. Não se esqueça de incluir na mensagem de saída o sufixo " valores positivos", conforme o exemplo abaixo:

--------------------------------------------
| Exemplo de Entrada | Exemplo de Saída    |
--------------------------------------------
| 7                  | 4 valores positivos |
| -5                 |                     |
| 6                  |                     |
| -3.4               |                     |
| 4.6                |                     |
| 12                 |                     |
--------------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class QuantityPositiveNumbers{
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int positives = 0;
    while (sc.hasNext()) {
      double number = sc.nextDouble();
      if (number>0) positives++;
    }
    System.out.println(positives+" valores positivos");
    sc.close();
  }
}