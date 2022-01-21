/*
=======================================================
Desafios - Desafios Intermediários - GFT Start #3 Java
=======================================================
3/3 - Acima da Diagonal Principal
=======================================================

Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão acima da diagonal principal da matriz, conforme ilustrado abaixo (área verde).

{matriz.png}

Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| S                  | 12.6             |
| 1.0                |                  |
| 0.0                |                  |
| -3.5               |                  |
| 2.5                |                  |
| 4.1                |                  |
| ...                |                  |
-----------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class AboveMainDiagonal {

  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);

    while (leitor.hasNext()) {
      String operation = leitor.next();
      int sum = 0, aboveDiagonal = 0, patternSize = 12;
      int pattern[][] = new int[patternSize][patternSize];
      
      for (int i=0; i<patternSize;i++)
        for (int j=0; j<patternSize;j++) pattern[i][j] = leitor.nextInt();
          
      for (int k=0; k<patternSize;k++) {
        for (int l=0; l<patternSize;l++) {
          if (l > k) {
            sum += pattern[k][l];
            aboveDiagonal++;
          }
        }
      }
      
      double result = (operation.equals("S")) ? (double)sum : (double)sum/(double)aboveDiagonal;
      
      System.out.printf("%.1f\n",result);
        
    }
    
    leitor.close();
  }
}