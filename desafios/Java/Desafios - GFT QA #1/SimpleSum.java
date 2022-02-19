/*
====================================================
Desafios - GFT QA #1
====================================================
2/6 - Soma Simples
====================================================

Desafio
Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e chame essa variável de SOMA.
A seguir escreva o valor desta variável.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a variável SOMA com todas as letras maiúsculas, inserindo um espaço em branco antes e depois do símbolo de igualdade, seguido pelo valor correspondente à soma de A e B.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 30                 | SOMA = 40        |
| 10                 |                  |
-----------------------------------------
| -30                | SOMA = -20       |
| 10                 |                  |
-----------------------------------------
| 0                  | SOMA = 0         |
| 0                  |                  |
-----------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class SimpleSum {
	public static void main(String[] args) throws IOException {
	 	Scanner sc = new Scanner (System.in);
		int A, B, soma;
 		A = sc.nextInt();
		B = sc.nextInt();
 		soma = A+B;
 		System.out.println("SOMA = " + soma);
 		sc.close();
	}
}