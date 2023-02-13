/*
====================================================
Desafios Intermediários - Banco PAN Java Developer
====================================================
2/5 - Quitanda do Seu Zé
====================================================

Desafio
Seu Zé está vendendo frutas com a seguinte tabela de preços:

---------------------------------------------
|         | Até 5 Kg       | Acima de 5 Kg  |
---------------------------------------------
| Morango | R$ 2,50 por Kg | R$ 2,20 por Kg |
| Maçã    | R$ 1,80 por Kg | R$ 1,50 por Kg |
---------------------------------------------

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

Entrada
Como entrada, você recebera a quantidade em kg de morangos e a quantidade em kg de maçãs.

Saída
Será o valor a ser pago pelo cliente, conforme a tabela de preços da quintanda do seu Zé.

Exemplo 1
-------------------
| Entrada | Saída |
-------------------
| 3       | 11.1  |
| 2       |       |
-------------------

Exemplo 2
-------------------
| Entrada | Saída |
-------------------
| 1       | 4.3   |
| 1       |       |
-------------------

Exemplo 3
-------------------
| Entrada | Saída |
-------------------
| 5       | 19.35 |
| 5       |       |
-------------------

SOLUÇÃO ABAIXO: */

import java.util.Scanner;

public class SeuZeGroceryStore {
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    int morangos = input.nextInt();
    int macas = input.nextInt();
    
    double valorKgMorango = (morangos > 5) ? 2.2 : 2.5;
    double valorMorangos = morangos * valorKgMorango;
    
    double valorKgMaca = (macas > 5) ? 1.5 : 1.8;
    double valorMacas = macas * valorKgMaca;
    
    int pesoTotalCompra = morangos + macas;
    
    double valorTotalCompra = valorMorangos + valorMacas;
    
    if (pesoTotalCompra > 8 || valorTotalCompra > 25.0) valorTotalCompra -= (0.1 * valorTotalCompra);
    
    System.out.println(valorTotalCompra);
    
    input.close();
  }
}