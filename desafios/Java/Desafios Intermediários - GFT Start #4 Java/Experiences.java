/*
====================================================
Desafios Intermediários - GFT Start #4 Java
====================================================
2/3 - Experiências
====================================================

Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.

-------------------------------------------------------
| Exemplo de Entrada | Exemplo de Saída               |
-------------------------------------------------------
| 10                 | Total: 92 cobaias              |
| 10 C               | Total de coelhos: 29           |
| 6 R                | Total de ratos: 40             |
| 15 S               | Total de sapos: 23             |
| 5 C                | Percentual de coelhos: 31.52 % |
| 14 R               | Percentual de ratos: 43.48 %   |
| 9 C                | Percentual de sapos: 25.00 %   |
| 6 R                |                                |
| 8 S                |                                |
| 5 C                |                                |
| 14 R               |                                |
-------------------------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class Experiences {
  public static void main(String[] args) throws IOException {
    Scanner input =new Scanner(System.in);
    int quantity, total, c=0, r=0, s=0;
    double cPercentage, rPercentage, sPercentage;
    String animal;

    int tests=input.nextInt();

    while (tests > 0) {
      quantity = input.nextInt();
      animal = input.next();
      switch (animal) {
        case "C":
          c += quantity;
          break;
        case "R":
          r += quantity;
          break;
        case "S":
          s += quantity;
          break;
        default:
          break;
      }
      tests--;
    }

    total = c+r+s;
    cPercentage = (((double)c/(double)total)*100);
    rPercentage = (((double)r/(double)total)*100);
    sPercentage = (((double)s/(double)total)*100);

    System.out.printf("Total: %d cobaias\n",total);
    System.out.printf("Total de coelhos: %d\n",c);
    System.out.printf("Total de ratos: %d\n",r);
    System.out.printf("Total de sapos: %d\n",s);
    System.out.printf("Percentual de coelhos: %.2f %%\n",cPercentage);
    System.out.printf("Percentual de ratos: %.2f %%\n",rPercentage);
    System.out.printf("Percentual de sapos: %.2f %%\n",sPercentage);

    input.close();
  }
}