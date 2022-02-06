/*
====================================================
Desafios Intermediários - GFT Start #4 Java
====================================================
1/3 - Área Direita
====================================================

Desafio
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na área direita da matriz, conforme ilustrado abaixo (área verde).

{area_direita.png}

Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| S                  | 111.4            |
| 1.0                |                  |
| 330.0              |                  |
| -3.5               |                  |
| 2.5                |                  |
| 4.1                |                  |
| ...                |                  |
-----------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class RightArea {

  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);

    while (leitor.hasNext()) {
      String operation = leitor.next();
      int rightArea = 0, patternSize = 12;
      double sum = 0d;
      double pattern[][] = new double[patternSize][patternSize];

      for (int i=0; i<patternSize;i++)
        for (int j=0; j<patternSize;j++) pattern[i][j] = leitor.nextDouble();

      for (int k=0; k<patternSize;k++) {
        for (int l=0; l<patternSize;l++) {
          int aux = patternSize-1;
          if (l>k && l>(aux-k) && l>(aux/2)) {
            sum += pattern[k][l];
            rightArea++;
          }
        }
      }

      double result = (operation.equals("S")) ? sum : sum/(double)rightArea;

      System.out.printf("%.1f\n",result);
    }
    leitor.close();
  }
}