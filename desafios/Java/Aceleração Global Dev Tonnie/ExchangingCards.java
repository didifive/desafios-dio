/* 
====================================================
Aceleração Global Dev Tonnie
====================================================
3/3 - Exchanging Cards
====================================================

Alice and Betty collect Pok´mon cards. The cards are printed for a game that imitates the battle system of one of the most popular videogames in history, but Alice and Betty are too young to actually play the game, and are only interested in the actual cards. To make it easier, we'll assume each card has a unique identifier, given as an integer number.
Both girls have a set of cards, and, like most girls their age, like to trade the cards they have. They obviously don't care about identical cards they both have, and they don't want to receive repeated cards in the trade. Besides, the cards are traded in a single operation: Alice gives Betty N distinct cards and receives back other N distinct cards.
The girls want to know what is the maximum number of cards they can trade. For instance, if Alice has cards {1, 1, 2, 3, 5, 7, 8, 8, 9, 15} and Betty has cards {2, 2, 2, 3, 4, 6, 10, 11, 11}, they can trade at most four cards.
Write a program that given the sets of cards owned by Alice and Betty, determines the maximum number of cards they can trade.

Input
The input contains several test cases. The first line of a test case contains two integers A and B, separated by a blank space, indicating respectively the number of cards Alice and Betty have (1 ≤ A ≤ 104 and 1 ≤ B ≤ 104). The second line contains A space-separated integers Xi, each indicating one of Alice\'s cards(1 ≤ Xi ≤ 105). The third line contains B integers Yi separated by whitespaces, each number indicating one of Betty's cards(1 ≤ Yi ≤ 105). Alice and Betty's cards are listed in non-descending order.
The end of input is indicated by a line containing only two zeros, separated by a blank space.

Output
For each test case, your program should print a single line, containing an integer number, indicating the maximum number of cards Alice and Betty can trade.

-----------------------------------------------
| Input Sample          | Output Sample       |
-----------------------------------------------
| 1 1                   | 0                   |
| 1000                  | 3                   |
| 1000                  | 4                   |
| 3 4                   |                     |
| 1 3 5                 |                     |
| 2 4 6 8               |                     |
| 10 9                  |                     |
| 1 1 2 3 5 7 8 8 9 15  |                     |
| 2 2 2 3 4 6 10 11 11  |                     |
| 0 0                   |                     |
-----------------------------------------------

SOLUTION BELOW: */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.StringTokenizer;

public class ExchangingCards {

  static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(in.readLine());
    int cards1 = Integer.parseInt(st.nextToken());
    int cards2 = Integer.parseInt(st.nextToken());

    while (cards1 > 0 && cards2 > 0) {
      
      List<Integer> linha = Arrays.asList(in.readLine().split(" "))
                .stream()
                .map(valor -> Integer.parseInt(valor))
                .collect(Collectors.toList());
                
      Set<Integer> cardsAlice = new HashSet<>();
      
      for (int cardA : linha) {
        cardsAlice.add(cardA);
      }
      
      
      List<Integer> linha2 = Arrays.asList(in.readLine().split(" "))
                .stream()
                .map(valor -> Integer.parseInt(valor))
                .collect(Collectors.toList());
                
      Set<Integer> cardsBetty = new HashSet<>();
      
      for (int cardB : linha2) {
        cardsBetty.add(cardB);
      }
      
      Set<Integer> cardsAlice2 = new HashSet<>(cardsAlice);
      Set<Integer> cardsBetty2 = new HashSet<>(cardsBetty);
      
      
      Iterator<Integer> iteratorA = cardsAlice.iterator();
      while (iteratorA.hasNext()) {
          if (cardsBetty2.contains(iteratorA.next())) iteratorA.remove();
      }
      
      Iterator<Integer> iteratorB = cardsBetty.iterator();
      while (iteratorB.hasNext()) {
          if (cardsAlice2.contains(iteratorB.next())) iteratorB.remove();
      }
      
      int maxTrade = 0;
      
      if (cardsAlice.size() <= cardsBetty.size())
        maxTrade = cardsAlice.size();
      else
        maxTrade = cardsBetty.size();
      
      System.out.println(maxTrade);
      
      st = new StringTokenizer(in.readLine());
      cards1 = Integer.parseInt(st.nextToken());
      cards2 = Integer.parseInt(st.nextToken());   
    }

    in.close();    
  }
}