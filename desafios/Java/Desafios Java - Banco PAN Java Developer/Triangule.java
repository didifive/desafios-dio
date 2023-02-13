/*
====================================================
Desafios Intermediários - Banco PAN Java Developer
====================================================
3/5 - Triângulo
====================================================

Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.
 
-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 6.0 4.0 2.0        | Area = 10.0      |
-----------------------------------------
| 6.0 4.0 2.1        | Perimetro = 12.1 |
-----------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Triangule {
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		double[] valores = new double[3];
		for (int i = 0; i < 3; i++) valores[i] = leitor.nextDouble();
		
		boolean triangulo = (valores[0] + valores[1] > valores[2])
                                    && (valores[0] + valores[2] > valores[1])
                                    && (valores[1] + valores[2] > valores[0]);  
		
		double valor = 0d;
		String mensagem = "";
		
		if (triangulo) {
		  mensagem = "Perimetro";
		  valor = Arrays.stream(valores).sum();
		} else {
		  mensagem = "Area";
		  valor = ((valores[0] + valores[1]) * valores[2]) / 2;
		}
		
		System.out.printf("%s = %.1f", mensagem, valor);
		
		leitor.close();
	}
}
