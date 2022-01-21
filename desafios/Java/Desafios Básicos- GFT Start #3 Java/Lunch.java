/*
====================================================
Desafios Básicos- GFT Start #3 Java
====================================================
3/3 - Lanche
====================================================

Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

--------------------------------------
| Código | Especificação   | Preço   |
--------------------------------------
| 1      | Cachorro-quente | R$ 4.00 |
| 2      | X-Salada        | R$ 4.50 |
| 3      | X-Bacon         | R$ 5.00 |
| 4      | Torrada Simples | R$ 2.00 |
| 5      | Refrigerante    | R$ 1.50 |
--------------------------------------

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 3 2                | Total: R$ 10.00  |
-----------------------------------------
| 4 3                | Total: R$ 6.00   |
-----------------------------------------
| 2 3                | Total: R$ 13.50  |
-----------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class Lunch {

	public static void main(String[] args) throws IOException {
		int X, Y;
		float preco = 0;
		
		Scanner input = new Scanner(System.in);
		X = input.nextInt();
		Y = input.nextInt();
		switch (X) {
		  case 1: 
		    preco  = (float) (4.00 * Y);
		    break;
		  case 2:
		    preco  = (float) (4.50 * Y);
		    break;
		  case 3:
		    preco  = (float) (5.00 * Y);
		    break;
		  case 4:
		    preco  = (float) (2.00 * Y);
		    break;
		  case 5:
		    preco  = (float) (1.50 * Y);
		    break;
		  default: preco = 0;
		}
		
		System.out.printf("Total: R$ %.2f\n",preco);
		
		input.close();
	}
}