/*
====================================================
Iniciando a programação em Java
====================================================
1/3 - Exibindo Números Pares
====================================================

Desafios
Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

Entrada
Você receberá 1 valor inteiro N, onde N > 0.

Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
| 6	             | 2                |
|                    | 4                |
|                    | 6                |
-----------------------------------------


SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumerosPares{
  
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int numero = Integer.parseInt(st.nextToken());
    	for (int i = 2 ; i <= numero; i++) {
    		if (i%2 == 0  ) System.out.println(i);
    	}
    }
	
}
