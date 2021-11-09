/*
====================================================
Solucionando desafios matemáticos em Java
====================================================
3/5 - Folha de Pagamento
====================================================

Desafio
Precisamos saber quanto uma determinada empresa deve pagar para seus colaboradores, porém temos apenas a quantidade de horas trabalhadas e o valor hora. Escreva um programa que leia o número de um colaborador, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse colaborador. Em seguida, apresente o número e o salário do colaborador, com duas casas decimais.

Entrada
Você receverá 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada.

Saída
Exiba o número e o salário do colaborador, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.

--------------------------------------------
| Exemplo de Entrada | Exemplo de Saída    |
--------------------------------------------
| 25                 | NUMBER = 25         |
| 100                | SALARY = U$ 550.00  |
| 5.50               |                     |
--------------------------------------------
| 1                  | NUMBER = 1          |
| 200                | SALARY = U$ 4100.00 |
| 20.50              |                     |
--------------------------------------------
| 6                  | NUMBER = 6          |
| 145                | SALARY = U$ 2254.75 |
| 15.55              |                     |
--------------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FolhaPagamento {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int valor1 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int valor2 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    double valor3 = Double.parseDouble(st.nextToken());

    double salary = valor2 * valor3;
    System.out.println("NUMBER = " + valor1);
    System.out.printf("SALARY = U$ %.2f", salary);
  }
}
