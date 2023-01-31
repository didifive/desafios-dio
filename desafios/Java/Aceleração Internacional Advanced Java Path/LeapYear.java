/* 
====================================================
Aceleração Internacional Advanced Java Path
====================================================
1/3 - Leap Year?
====================================================

Challenge
Make a program that asks for a number corresponding to a certain year and then informs if this year is a leap year or not

Input
The input consists of an integer value referring to the requested year.

Output
The output should return whether the year will be a leap year or not, as shown in the example below.

Example
| Input	| Output          |
|-------|-----------------|
| 1996  | “Leap year”     |
| 2001  | “Not leap year” |           

SOLUÇÃO ABAIXO: */

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int year;
    
        year = reader.nextInt();
        
        String leapYear = ((year%400 == 0) || (year%4==0 && year%100!=0))
                  ? "Leap year"
                  : "Not leap year";
                          
        System.out.println(leapYear);
        
        reader.close();
    }
}