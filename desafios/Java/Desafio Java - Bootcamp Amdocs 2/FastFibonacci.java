/*
====================================================
Desafio Java - Bootcamp Amdocs 2
====================================================
2/3 - Fibonacci Rápido
====================================================

A fórmula de Binet é uma forma de calcular números de Fibonacci.

{fibonacci.png}

Sua tarefa é, dado um natural n, calcular o valor de Fibonacci(n) usando a fórmula acima.

Entrada
A entrada é um número natural n (0 < n ≤ 50).

Saída
A saída é o valor de Fibonacci(n) com 1 casa decimal utilizando a fórmula de Binet dada.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 1                  | 1.0              |
-----------------------------------------
| 2                  | 1.0              |
-----------------------------------------
| 3                  | 2.0              |
-----------------------------------------
Prova 2 (D2) de Programação de Computadores 2016/1 da UNILA

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class FastFibonacci {

	public static void main(String[] args) throws IOException {
		int n = new Scanner(System.in).nextInt();
		final double SQUARE_ROOT_FIVE = Math.sqrt(5);
  	double fibonacciN = (
  	  Math.pow(((1+SQUARE_ROOT_FIVE)/2),n)
  	  - Math.pow(((1-SQUARE_ROOT_FIVE)/2),n)
	  )/SQUARE_ROOT_FIVE;
  	System.out.printf("%.1f",fibonacciN);
  }
}