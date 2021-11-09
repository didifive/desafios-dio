/*
====================================================
Solucionando desafios matemáticos em Java
====================================================
5/5 - Análise de Números
====================================================

Desafio
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos. Considere que o número zero é positivo, mas não pode ser considerado como positivo ou negativo.

Entrada
Você receberá 5 valores inteiros.

Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.

--------------------------------------------
| Exemplo de Entrada | Exemplo de Saída    |
--------------------------------------------
| -5                 | 3 par(es)           |
| 0                  | 2 impar(es)         |
| -3                 | 1 positivo(s)       |
| -4                 | 3 negativo(s)       |
| 12                 |                     |
--------------------------------------------

SOLUÇÃO ABAIXO: */

import java.util.Scanner;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class AnaliseNumeros {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> valores = new ArrayList<Integer>();

        while (sc.hasNextLine()) {
            valores.add(Integer.parseInt(sc.nextLine()));
        }

        List<Integer> par = valores.stream().filter(valor -> valor % 2 == 0).collect(Collectors.toList());
        List<Integer> imp = valores.stream().filter(valor -> valor % 2 != 0).collect(Collectors.toList());
        List<Integer> pos = valores.stream().filter(valor -> valor > 0).collect(Collectors.toList());
        List<Integer> neg = valores.stream().filter(valor -> valor < 0).collect(Collectors.toList());

        System.out.println(par.size() + " par(es)");
        System.out.println(imp.size() + " impar(es)");
        System.out.println(pos.size() + " positivo(s)");
        System.out.println(neg.size() + " negativo(s)");

    }
}
