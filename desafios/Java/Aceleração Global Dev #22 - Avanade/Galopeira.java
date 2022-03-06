/* 
====================================================
Desafios - Aceleração Global Dev #22 - Avanade
====================================================
3/3 - Galopeira
====================================================

Desafio
Sempre competindo para saber quem é o melhor, Capitão América e Homem de Ferro fizeram um desafio: quem digita mais rápido. Para isto, conseguiram um computador que não processa teclas pressionadas, ou seja, se for para digitar a mesma letra duas vezes seguidas, precisa pressionar a tecla duas vezes, visto que, pressionar a tecla por mais tempo, não adianta, e calcularam o tempo de uma tecla pressionada, que foi de um centésimo de segundo.
O desafio seria quem digitasse a palavra “galopeira”, formada por mais letras e, mas ambos eram muito bons e chegava num ponto que não era possível contar quantas letras haviam sido digitadas. Então, os super heróis pediram humildemente a sua ajuda para escrever um programa que verifique a palavra digitada e veja quanto tempo foi gasto para a digitação.

Escreva um programa que, dada uma palavra digitada, informe quanto tempo foi gasto para ser digitada.

Entrada
Um número inteiro C será informado, que será a quantidade de casos de teste. Cada caso tem uma palavra, de, no mínimo, 9 e, no máximo 10000 letras.

Saída
Para cada caso de teste, imprima um número T, que é o tempo gasto, em segundos, para digitar a palavra do respectivo caso de teste, com aproximação de duas casas decimais.

------------------------------------------------
| Exemplo de Entrada        | Exemplo de Saída |
------------------------------------------------
| 3                         | 0.09             |
| galopeira                 | 0.25             |
| galopeeeeeeeeeeeeeeeeeira | 0.10             |
| galopeeira                |                  |
------------------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class Galopeira {
	
  public static void main(String[] args) throws IOException {
  	double T;
  	String galopeira;
  	Scanner leitor = new Scanner(System.in);
  	int C = leitor.nextInt();
  	for (int i=0; i<C; i++) {
      galopeira = leitor.next();
      T = 0.01 * galopeira.length();
      System.out.printf("%.2f\n",T);
  	}
  	leitor.close();
  }
}