/* 
====================================================
Aceleração Internacional Advanced Java Path
====================================================
3/3 - Exceeding V
====================================================

Challenge
As a good developer, you need to make a program that reads two integers: R and V (as many values for V as needed must be read, until a value greater than R is entered for it). Count how many integers must be added in sequence (considering the R in this sum) so that the sum exceeds V as little as possible. Write the final count value.  
The entry can contain, for example, the values 21 21 15 30. In this case, the value 21 is then assumed for R while the values 21 and 15 must be disregarded since they are less than or equal to R. As the value 30 is within the specification (greater than R) it will be valid and then the calculations must be processed to present the value 2 in the output, as it is the amount of values added to produce a value greater than 30 (21 + 22).

Input
The input contains only integer values, one per line, which can be positive or negative. The first input value will be the value of R. The next input line will contain V. If V does not meet the problem specification, it must be read again, as many times as necessary.

Output
Print a line with an integer that represents the amount of integers that must be added, according to the specification above.

**Example**
| Input	| Output |
|-------|--------|
| 3     | 5      |
| 1     |        |  
| 20    |        |  

SOLUÇÃO ABAIXO: */

import java.util.Scanner;

public class ExceedingV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int V = 0;
        
        while (V <= R) {
          V = scanner.nextInt();
        }
        
        int sum = 0;
        int aux = R;
        int amount = 0;
        
        while (sum <= V) {
          sum += aux;
          aux++;
          amount++;
        }

        System.out.println(amount);
        
        scanner.close();
   }
}