/*
====================================================
Desafios Iniciais - GFT Start #3 Java
====================================================
1/3 - Multiplicação Simples
====================================================

Desafio
Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores. Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).   

Entrada
A entrada contém 2 valores inteiros.

Saída
Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 3                  | PROD = 27        |
| 9                  |                  |
-----------------------------------------
| -30                | PROD = -300      |
| 10                 |                  |
-----------------------------------------
| 0                  | PROD = 0         |
| 9                  |                  |
-----------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class SimpleMultiplication {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		PROD = A*B;
		
		System.out.println("PROD = " + PROD);
		
		sc.close();
		
	}
}