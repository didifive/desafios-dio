/*
====================================================
Desafios - GFT Start #4 Java
====================================================
2/3 - Notas e Moedas
====================================================

Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.

-----------------------------------------------
| Exemplo de Entrada | Exemplo de Saída       |
-----------------------------------------------
| 576.73             | NOTAS:                 |
|                    | 5 nota(s) de R$ 100.00 |
|                    | 1 nota(s) de R$ 50.00  |
|                    | 1 nota(s) de R$ 20.00  |
|                    | 0 nota(s) de R$ 10.00  |
|                    | 1 nota(s) de R$ 5.00   |
|                    | 0 nota(s) de R$ 2.00   |
|                    | MOEDAS:                |
|                    | 1 moeda(s) de R$ 1.00  |
|                    | 1 moeda(s) de R$ 0.50  |
|                    | 0 moeda(s) de R$ 0.25  |
|                    | 2 moeda(s) de R$ 0.10  |
|                    | 0 moeda(s) de R$ 0.05  |
|                    | 3 moeda(s) de R$ 0.01  |
-----------------------------------------------
| 4.00               | NOTAS:                 |
|                    | 0 nota(s) de R$ 100.00 |
|                    | 0 nota(s) de R$ 50.00  |
|                    | 0 nota(s) de R$ 20.00  |
|                    | 0 nota(s) de R$ 10.00  |
|                    | 0 nota(s) de R$ 5.00   |
|                    | 2 nota(s) de R$ 2.00   |
|                    | MOEDAS:                |
|                    | 0 moeda(s) de R$ 1.00  |
|                    | 0 moeda(s) de R$ 0.50  |
|                    | 0 moeda(s) de R$ 0.25  |
|                    | 0 moeda(s) de R$ 0.10  |
|                    | 0 moeda(s) de R$ 0.05  |
|                    | 0 moeda(s) de R$ 0.01  |
-----------------------------------------------
| 91.01              | NOTAS:                 |
|                    | 0 nota(s) de R$ 100.00 |
|                    | 1 nota(s) de R$ 50.00  |
|                    | 2 nota(s) de R$ 20.00  |
|                    | 0 nota(s) de R$ 10.00  |
|                    | 0 nota(s) de R$ 5.00   |
|                    | 0 nota(s) de R$ 2.00   |
|                    | MOEDAS:                |
|                    | 1 moeda(s) de R$ 1.00  |
|                    | 0 moeda(s) de R$ 0.50  |
|                    | 0 moeda(s) de R$ 0.25  |
|                    | 0 moeda(s) de R$ 0.10  |
|                    | 0 moeda(s) de R$ 0.05  |
|                    | 1 moeda(s) de R$ 0.01  |
-----------------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class NotesAndCoins {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    String text;
    BigDecimal aux, value;
    BigDecimal[] notesCoins = {
            new BigDecimal("100.00")
            ,new BigDecimal("50.00")
            ,new BigDecimal("20.00")
            ,new BigDecimal("10.00")
            ,new BigDecimal("5.00")
            ,new BigDecimal("2.00")
            ,new BigDecimal("1.00")
            ,new BigDecimal("0.50")
            ,new BigDecimal("0.25")
            ,new BigDecimal("0.10")
            ,new BigDecimal("0.05")
            ,new BigDecimal("0.01")
    };

    value = new BigDecimal(sc.next().replace(',', '.'));

    for (BigDecimal noteCoin : notesCoins) {
      if (noteCoin.equals(notesCoins[0])) System.out.println("NOTAS:");
      if (noteCoin.equals(notesCoins[6])) System.out.println("MOEDAS:");
      text = (noteCoin.compareTo(notesCoins[6]) > 0) ? "nota" : "moeda";
      aux = value.divideToIntegralValue(noteCoin);
      System.out.printf("%s %s(s) de R$ %s\n", aux, text, noteCoin);
      value = value.subtract(aux.multiply(noteCoin));
    }

    sc.close();
  }
}