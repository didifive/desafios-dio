/*
====================================================
Desafio Java - Bootcamp Amdocs 2
====================================================
1/3 - Fatorial Simples
====================================================

Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada
A entrada contém um valor inteiro N (0 < N < 13).

Saída
A saída contém um valor inteiro, correspondente ao fatorial de N.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 4                  | 24               |
-----------------------------------------
Agradecimentos a Cassio F.

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class SimpleFactorial{

	public static void main(String[] args) throws IOException {
	
    int input = new Scanner(System.in) .nextInt();
    
    int factorial = input;
    
    for (int i=(input-1); i>0; i--)
      factorial *= i;

		System.out.println(factorial);
		
	}
}