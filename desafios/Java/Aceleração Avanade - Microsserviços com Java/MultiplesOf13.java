/* 
====================================================
Aceleração Avanade - Microsserviços com Java
====================================================
2/3 - Múltiplos de 13
====================================================

Desafio
Escreva um algoritmo que leia 2 valores inteiros A e B calcule a soma dos números que não são múltiplos de 13 entre A e B, incluindo ambos.

Entrada
O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.

Saída
Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada, inclusive ambos se for o caso.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 100                | 13954            |
| 200                | quarto           |
-----------------------------------------

SOLUÇÃO ABAIXO: */

import java.util.Scanner;

public class MultiplesOf13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n2 < n1) {
		  int aux = n1;
		  n1 = n2;
		  n2 = aux;
		}
		
		for (int i=n1; i<=n2; i++)
		  if (i%13 != 0) soma += i;

        System.out.println(soma);

        sc.close();
    }
}
