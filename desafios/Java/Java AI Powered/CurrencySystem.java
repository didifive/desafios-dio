/*
Java AI Powered
========================================================
Desafios de Código Java Intermediários: Design Patterns
========================================================
5/5 - Implementando um Adaptador para Conversão de Moedas
========================================================

Descrição
O padrão de projeto Adapter é um padrão de projeto estrutural que permite que objetos com interfaces incompatíveis trabalhem juntos. Ele atua como um intermediário, adaptando a interface de uma classe para outra interface esperada pelo cliente.

Neste desafio, você deverá implementar um conversor de moedas que permitirá que valores monetários sejam convertidos de dólares americanos (USD) para euros (EUR). Embora exista uma taxa de conversão direta de 1 USD = 0.85 EUR, o nosso sistema inicialmente só suportava a conversão de USD para libras esterlinas (GBP). Utilizando o padrão Adapter, você deve adaptar esse sistema antigo para fornecer a nova funcionalidade de conversão direta para EUR, usando a conversão intermediária para GBP.

Entrada
Um valor em dólares americanos USD (Double).

Saída
O valor convertido para euros EUR (Double) usando o adaptador.

Taxa de conversão direta (para referência):
1 USD = 0.85 EUR

Taxas de conversão para a adaptação:
1 USD para GBP = 0.80
1 GBP para EUR = 1.0625

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

-------------------------
| Entrada |  Saída      |
-------------------------
| 200     | USD: 200.0  |
|         | EUR: 170.0  |
-------------------------
| 150     | USD: 150.0  |
|         | EUR: 127.5  |
-------------------------
| 1000.0  | USD: 1000.0 |
|         | EUR: 850.0  |
-------------------------

Nota:
O padrão Adapter é uma ferramenta valiosa para lidar com incompatibilidades de interface e integrar componentes heterogêneos. No entanto, é importante avaliar cuidadosamente sua utilização para garantir que os benefícios superem os possíveis custos em termos de complexidade e desempenho.

Caso queira saber mais sobre o Design Pattern Adapter:
https://refactoring.guru/pt-br/design-patterns/adapter


SOLUÇÃO ABAIXO: */

import java.util.Scanner;

class OldCurrencyConverter {
    public double convertUSDtoGBP(double amount) {
        return amount * 0.80;
    }
}

class CurrencyAdapter {
    private final OldCurrencyConverter oldConverter;

    public CurrencyAdapter(OldCurrencyConverter oldConverter) {
        this.oldConverter = oldConverter;
    }

    public double convertUSDtoEUR(double amount){
        double amountGBP = oldConverter.convertUSDtoGBP(amount);
        return amountGBP * 1.0625;
    }

}

public class CurrencySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        
        scanner.close();

        OldCurrencyConverter oldConverter = new OldCurrencyConverter();
        CurrencyAdapter adapter = new CurrencyAdapter(oldConverter);
        
        double amountEUR = adapter.convertUSDtoEUR(input);

        System.out.printf("USD: %.1f%n", input);
        System.out.printf("EUR: %.1f%n", amountEUR);
    }
}