/* 
====================================================
Aceleração Global Dev #18 - GFT
====================================================
1/3 - Copa
====================================================

O sorteio das posições dos jogadores na chave decisiva da copa do mundo de ping-pong está deixando a todos nervosos. É que ninguém quer pegar o jogador mais bem ranqueado, o Mestre Kung, logo nas oitavas de final, ou nas quartas de final. Melhor que só seja possível enfrentar Mestre Kung na semifinal ou na final!
A chave possui 16 posições numeradas de 1 a 16, como na figura abaixo. A organização da copa vai fazer um sorteio para definir em qual posição cada jogador vai iniciar a chave decisiva. Nas oitavas de final, o jogador na posição 1 enfrenta o jogador na posição 2; o da posição 3 enfrenta o da posição 4; e assim por diante, como na figura: tournament.png.
O objetivo deste problema é, dadas as posições de Mestre Kung e Mestre Lu na chave, decidir em que fase da competição Mestre Kung e Mestre Lu vão se enfrentar, caso vençam todas as suas respectivas partidas antes de se enfrentarem. Por exemplo, se o sorteio da chave determinar que Mestre Kung ocupará a posição 1 e Mestre Lu a posição 2 da chave, eles se encontrarão nas oitavas de final; se Mestre Kung ocupar a posição 6 e Mestre Kung ocupar a posição 9 da chave, eles se encontrarão somente na final.

Entrada
A entrada consiste de duas linhas. A primeira linha da entrada contém um inteiro K (1 ≤ K ≤ 16) que indica a posição de Mestre Kung na chave. A segunda linha da entrada contém um inteiro L (1 ≤ L ≤ 16, K \(\ne \) L) que indica a posição de Mestre Lu na chave.

Saída
Seu programa deve produzir uma linha contendo uma das palavras seguintes, decidindo a fase em que vão se enfrentar os jogadores Mestre Kung e Mestre Lu, se eles chegarem a se enfrentar: oitavas, quartas, semifinal ou final.

--------------------------------------------
| Exemplo de Entrada | Exemplo de Saída    |
--------------------------------------------
| 10                 | semifinal           |
| 14                 |                     |
--------------------------------------------
| 7                  | oitavas             |
| 8                  |                     |
--------------------------------------------
| 3                  | final               |
| 13                 |                     |
--------------------------------------------
| 5                  | quartas             |
| 8                  |                     |
--------------------------------------------
Olimpíada Brasileira de Informática – OBI2018 Fase 2
*Para um conjunto de casos de testes valendo 30 pontos, K = 1.

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class Tournament {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int masterKung= Integer.parseInt(sc.nextLine());
    int masterLu= Integer.parseInt(sc.nextLine());
    
    String round = "";
    
    if ((masterKung % 2) != 0) {
      if ((masterLu-masterKung) == 1){
        round = "oitavas";
      } else if ((masterLu-masterKung) <=3) {
        round = "quartas";
      } else if ((masterLu-masterKung) <=8) {
        round = "semifinal";
      }
      else {
        round = "final";
      }
    } else {
      if ((masterLu-masterKung) <=2){
        round = "quartas";
      } else if ((masterLu-masterKung) <=8) {
        round = "semifinal";
      } else {
        round = "final";
      }
    }
      
    System.out.println(round);
   
    sc.close();
  }
}