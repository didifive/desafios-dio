/* 
====================================================
Aceleração Global Dev Tonnie
====================================================
1/3 - Enjoy the Offer
====================================================

Challenge
A supermarket is doing a sales promotion for soft drinks. If one day you buy soft drinks and bring the empty bottles the next day, they exchange each set of K empty bottles for a full one. A customer wants to make the most of this offer and therefore bought several bottles on the first day of the promotion. Now he wants to know how many bottles he will have at the end of the second day of the promotion if he use it to the fullest.
Make a program to calculate this.

Input
The first input line contains integer T (1 ≤ T ≤ 10000), which indicates the number of test cases. In each of the following T lines come two integers N and K (1 ≤ K, N ≤ 10000), respectively the number of soft drinks bought and the number of empty bottles to gain a full.

Output
For each test case print the number of bottles that the customer will have on the second day, if he makes the most of the offer.

--------------------------------------------
| Input Sample       | Output Sample       |
--------------------------------------------
| 3                  | 4                   |
| 7 4                | 4                   |
| 4 7                | 574                 |
| 4000 7             |                     |
--------------------------------------------

SOLUTION BELOW: */

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EnjoyTheOffer{
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int numberTests= Integer.parseInt(sc.nextLine()); 
      for (int i = 0; i < numberTests; i++) {
        List<Integer> linha = Arrays.asList(sc.nextLine().split(" "))
                .stream()
                .map(valor -> Integer.parseInt(valor))
                .collect(Collectors.toList());
                
        int drinksBought = linha.get(0);
        int emptyBottles = linha.get(1);
        
        int gainDrinks = drinksBought / emptyBottles;
        
        int remainingEmpty = drinksBought - (gainDrinks * emptyBottles);
        
        int bottlesSecondDay = gainDrinks + remainingEmpty;
        
        System.out.println(bottlesSecondDay);
      }
    sc.close();
  }
}