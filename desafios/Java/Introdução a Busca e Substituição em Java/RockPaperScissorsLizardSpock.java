/*
====================================================
Introdução a Busca e Substituição em Java
====================================================
4/5 - Pedra, Papel, Tesoura, Lagarto e Spock
====================================================

Desafio
Pedra-papel-tesoura-lagarto-Spock é uma expansão do clássico método de seleção em jogo de pedra-papel-tesoura. Atua sob o mesmo princípio básico, mas inclui outras duas armas adicionais: o lagarto (formado pela mão igual a uma boca de fantoche) e Spock (formada pela saudação dos vulcanos em Star Trek). Isso reduz as chances de uma rodada terminar em um empate. O jogo foi inventado por Sam Kass e Karen Bryla, como "Rock Paper Scissors Lizard Spock". As regras de vantagem são as seguintes:

• Tesoura corta papel
• Papel cobre pedra
• Pedra derruba lagarto
• Lagarto adormece Spock
• Spock derrete tesoura
• Tesoura prende lagarto
• Lagarto come papel
• Papel refuta Spock
• Spock vaporiza pedra
• Pedra quebra tesoura

Um dia, duas amigas, Fernanda e Marcia, decidiram apostar quem pagaria um almoço para o outro, com esta brincadeira. Sua missão será fazer um algoritmo que, baseado no que eles escolherem, informe quem irá ganhar ou se dará empate.

Entrada
Haverá diversos casos de teste. O primeiro número a ser lido será um inteiro, representando a quantidade de casos de teste. Cada caso de teste tem duas palavras, representando a escolha de Fernanda e de Marcia, respectivamente.

Saída
Para cada caso de teste, imprima quem venceu, ou se houve empate.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 3                  | empate           |
| spock spock        | Marcia           |
| tesoura spock      | Fernanda         |
| lagarto spock      |                  |
-----------------------------------------
OBS.: Apesar de na tabela os nomes Fernanda e Marcia estarem com a primeira letra maiúscula, no teste ele esperava os nomes com todas as letras minúsculas.

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RockPaperScissorsLizardSpock {
  public static void main(String[] args) throws IOException {
      
    boolean firstWin, tie;
    int tests;
    String winner;
    List<String> plays;
    List<PlaysRule> playsRules = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    tests = sc.nextInt();
    sc.nextLine();
    
    playsRules.add(new PlaysRule("tesoura", "papel"));
    playsRules.add(new PlaysRule("papel", "pedra"));
    playsRules.add(new PlaysRule("pedra", "lagarto"));
    playsRules.add(new PlaysRule("lagarto", "spock"));
    playsRules.add(new PlaysRule("spock", "tesoura"));
    playsRules.add(new PlaysRule("tesoura", "lagarto"));
    playsRules.add(new PlaysRule("lagarto", "papel"));
    playsRules.add(new PlaysRule("papel", "spock"));
    playsRules.add(new PlaysRule("spock", "pedra"));
    playsRules.add(new PlaysRule("pedra", "tesoura"));
    
    for (int i=0; i<tests; i++) {
      firstWin = false;
      tie = false;
      plays = Arrays.asList(sc.nextLine().split(" "));
      if(plays.get(0).equals(plays.get(1))){
        tie = true;
      } else {
        firstWin = false;
        for (PlaysRule playsRule : playsRules) {
          if (playsRule.getWin().equals(plays.get(0))
            && playsRule.getLose().equals(plays.get(1))
          ) {
            firstWin = true;
            break;
          }
        }
      }
      winner = tie ?
                  "empate" :
                  firstWin ? "fernanda" : "marcia";
      System.out.println(winner);
    }
    sc.close();
  }
}

final class PlaysRule {
  private String win;
  private String lose;

  public PlaysRule(String win, String lose) {
    this.win = win;
    this.lose = lose;
  }

  public String getWin() {
    return win;
  }

  public String getLose() {
    return lose;
  }
}