/*
====================================================
Explorando a Sintaxe Básica de Java
====================================================
2/2 - Conversor de Temperatura com Validação
====================================================

Desafio
Você está criando um utilitário interno que ajuda a converter temperaturas de Celsius para Fahrenheit. No entanto, o sistema deve evitar falhas por entradas inválidas, como strings ou valores negativos em contextos indevidos.

Implemente um programa que:
Leia uma temperatura em Celsius.
Converta para Fahrenheit usando a fórmula: F = (C × 9/5) + 32

Entrada
Um número decimal representando graus Celsius.
Caso a entrada não seja um número ou seja menor que -273.15, o sistema deve tratar a exceção.

Saída
A temperatura convertida para Fahrenheit, com uma casa decimal.
Em caso de erro, exibir: "Entrada invalida"

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.
-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 25.0               | 77.0             |
| -300.0             | Entrada invalida |
| abc                | Entrada invalida |
-----------------------------------------

Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

SOLUÇÃO ABAIXO:
*/

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (!scanner.hasNextDouble()) {
              throw new RuntimeException();
            }
            
            double celsius = scanner.nextDouble();
            if (celsius < -273.15) {
              throw new RuntimeException();
            }
            
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.printf("%.1f%n", fahrenheit);
            
        } catch (Exception e) {
            System.out.println("Entrada invalida");
        }
    }
}