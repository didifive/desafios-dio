/*
=======================================================
Desafios - Desafios Intermediários - GFT Start #3 Java
=======================================================
2/3 - Top N
=======================================================

Recentemente aconteceu a fase regional da Maratona de Programação da SBC, onde mais de 600 times participaram em mais de 40 sedes diferentes pelo Brasil. Seu amigo participou da competição, e quando questionado sobre sua colocação lhe disse: “Ficamos no top 10”.
Você ficou feliz pelo seu amigo, mas não pode deixar de ficar curioso sobre qual foi sua real colocação. “Top 10” poderia indicar qualquer posição entre primeiro e décimo colocado, porém se ele estivesse em primeiro provavelmente teria dito “Top 1”, se estivesse em segundo ou terceiro provavelmente teria dito “Top 3”, e se estivesse em quarto ou quinto provavelmente teria dito “Top 5”. Logo, sua real colocação foi entre sexto e décimo, pois as pessoas geralmente se colocam na menor categoria a qual pertencem.
Você reuniu então todas as categorias de colocações que as pessoas mais usam: 1, 3, 5, 10, 25, 50 e 100. Dada uma colocação K, diga o número da menor categoria que esta colocação pertence.

Entrada
Cada caso de teste contém um inteiro K, representando uma colocação (1 ≤ K ≤ 100).

Saída
Para cada caso de teste imprima uma linha contendo a frase “Top N”, e substitua a letra N pelo número da menor categoria que a colocação K pertence.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 7                  | Top 10           |
-----------------------------------------
| 25	               | Top 25           |
-----------------------------------------
| 26	               | Top 50           |
-----------------------------------------
III Maratona de Programação FACE - 2015

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class TopN {

  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    int[] TOPS = {1, 3, 5, 10, 25, 50, 100};
    while (scan.hasNext()) {
      int position = scan.nextInt();
      int topN;
      if (position == 1) topN = TOPS[0];
      else if (position <= 3) topN = TOPS[1];
      else if (position <= 5) topN = TOPS[2];
      else if (position <= 10) topN = TOPS[3];
      else if (position <= 25) topN = TOPS[4];
      else if (position <= 50) topN = TOPS[5];
      else topN = TOPS[6];
      
      System.out.println("Top " + topN);
    }
    scan.close();
  }
}