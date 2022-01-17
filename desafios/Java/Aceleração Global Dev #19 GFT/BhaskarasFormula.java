/* 
====================================================
Aceleração Global Dev #19 - GFT
====================================================
3/3 - Fórmula de Bhaskara
====================================================

Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.

--------------------------------------------
| Exemplo de Entrada | Exemplo de Saída    |
--------------------------------------------
| 10.0 20.1 5.1      | R1 = -0.29788       |
|                    | R2 = -1.71212       |
--------------------------------------------
| 0.0 20.0 5.0       | Impossivel calcular |
--------------------------------------------       
| 10.3 203.0 5.0     | R1 = -0.02466       |
|                    | R2 = -19.68408      |
--------------------------------------------
| 10.0 3.0 5.0       | Impossivel calcular |
--------------------------------------------       

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class BhaskarasFormula {
	
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double C = sc.nextDouble();
    
    String text = "";
    
    double delta = Math.pow(B,2) - (4*A*C);
    
    if (A == 0) {
      text = "Impossivel calcular";
    } else if (delta < 0) {
      text = "Impossivel calcular";
    } else {
      double r1, r2;
      r1 = (-B + Math.sqrt(delta)) / (2 * A);
      r2 = (-B - Math.sqrt(delta)) / (2 * A);
      text = String.format("R1 = %.5f\nR2 = %.5f",r1,r2);
    }
    
    System.out.println(text);
    
    sc.close();
  }
}