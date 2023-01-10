/* 
====================================================
Aceleração Avanade - Microsserviços com Java
====================================================
3/3 - Blobs
====================================================

Desafio
No planeta Alpha vive a criatura Blobs, que come precisamente 1/2 de seu suprimento de comida disponível todos os dias. Escreva um algoritmo que leia a capacidade inicial de suprimento de comida, e calcule quantos dias passarão antes que Blobs coma todo esse suprimento até restar um quilo ou menos.

Entrada
A primeira linha de entrada contem um único inteiro N (1 ≤ N ≤ 1000), indicando o número de casos de teste. As N linhas seguintes contém um valor de ponto flutuante C (1 ≤ C ≤ 1000) correspondente à quantidade de comida disponível para Blobs.

Saída
Para cada caso de teste, imprima uma linha contendo o número de dias que Blobs irá demorar para comer todo seu suprimento de comida, seguido da palavra "dias".

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 3                  | 6 dias           |
-----------------------------------------
| 40.0               | 8 dias           |
-----------------------------------------
| 200.0              | 9 dias           |
-----------------------------------------
| 300.0              |                  |
-----------------------------------------

SOLUÇÃO ABAIXO: */

import java.util.Scanner;

public class Blobs {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        int entry = reader.nextInt();
        int days = 0;
        
        for (int i = entry; i>0; i--){
          double supply = reader.nextDouble();
          
          while (supply > 1d) {
            days++;
            supply /= 2;
          }
          
          System.out.printf("%d dias%n",days);
          days = 0;
        }

        reader.close();
    }
}