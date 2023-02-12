/*
====================================================
Desafios Básicos - Banco PAN Java Developer
====================================================
1/5 - Fábrica de Carros
====================================================

Desafio
O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). O gerente de uma loja de carros gostaria de um programa para calcular o preço de um carro novo para os clientes. Você receberá o custo de fábrica e as porcentagens referentes ao distribuidor e os impostos e deverá escrever programa para ler esses valores e imprimir o valor final do carro.

Entrada
Você recebera três valores inteiros que representam o custo de fábrica, as porcentagens do distribuidor e os impostos.

Saída
Como saída, teremos o valor final do preço de um carro novo.

Exemplo 1
-------------------
| Entrada | Saída |
-------------------
| 20000   | 34600 |
| 28      |       |
| 45      |       |
-------------------

Exemplo 2
-------------------
| Entrada | Saída |
-------------------
| 30000   | 36000 |
| 10      |       |
| 10      |       |
-------------------

SOLUÇÃO ABAIXO: */

import java.util.Scanner;

public class CarFactory{

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
      int custoFabrica = scan.nextInt();
	    int percentualDistribuidor = scan.nextInt();
	    int percentualImpostos = scan.nextInt();
	    
      int custoConsumidor;

      custoConsumidor = ((percentualDistribuidor + percentualImpostos + 100) * custoFabrica) / 100;

      System.out.println(custoConsumidor);
      
      scan.close();
	}
}