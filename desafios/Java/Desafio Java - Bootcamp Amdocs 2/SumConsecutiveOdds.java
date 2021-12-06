/*
====================================================
Desafio Java - Bootcamp Amdocs 2
====================================================
3/3 - Soma de Impares Consecutivos I
====================================================

Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 6                  | 5                |
| -5                 |                  |
-----------------------------------------
| 15                 | 13               |
| 12                 |                  |
-----------------------------------------
| 12                 | 0                |
| 12                 |                  |
-----------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.Scanner;

public class SumConsecutiveOdds {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int last = sc.nextInt();
		
		if (first > last) {
		  int aux = first;
		  first = last;
		  last = aux;
		}

		List<Integer> listOdds = new ArrayList<Integer>();
		
		for(int i=(first+1); i<last; i++)
		  if (i%2 != 0) listOdds.add(i);
		
		int sumOdds = listOdds.stream()
                .mapToInt(Integer::intValue)
                .sum();

    System.out.println(sumOdds);
    sc.close();
	}
}