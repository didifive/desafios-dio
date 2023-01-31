/* 
====================================================
Aceleração Internacional Advanced Java Path
====================================================
2/3 - Difference Between Digits
====================================================

Challenge
The challenge consists of an integer n, where it will be necessary to calculate the difference between the product and the sum of its digits.

Input
- To find the product of the value, the digits must be multiplied.
- The sum, just add the digits.
- For the difference, it is necessary to subtract the final result from the two values.

Output
The output should return the final value of the difference between the product and the sum of the digits.

Example
| Input	| Output |
|-------|--------|
| 243   | 15     |
| 1521  | 1      |       

SOLUÇÃO ABAIXO: */

import java.util.Scanner;

public class DifferenceBetweenDigits {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        
        int product = 1;
        int sum = 0;
        
        while(num > 0) {
          int numAux = num%10;
          product *= numAux;
          sum += numAux;
          num /= 10;
        }
        
        System.out.println(product-sum);

        scan.close();
    }
}