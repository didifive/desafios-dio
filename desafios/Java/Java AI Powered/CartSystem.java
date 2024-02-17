/*
Java AI Powered
========================================================
Desafios de Código Java Intermediários: Design Patterns
========================================================
4/5 - Implementando um Carrinho de Compras com Padrão Strategy
========================================================

Descrição
Você está desenvolvendo um sistema simples de carrinho de compras. O desafio é implementar a funcionalidade de calcular o total da compra, permitindo que o usuário escolha entre diferentes estratégias de desconto, utilizando o padrão de projeto Strategy.

Entrada
O programa deve permitir que o usuário adicione produtos ao carrinho, informando o nome e o preço de cada produto. Em seguida, o usuário deve escolher a estratégia de desconto desejada entre duas opções: 10% de desconto ou frete grátis.

Saída
O programa deve calcular e exibir o total da compra com base na estratégia de desconto escolhida.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

----------------------------------------
| Entrada   |  Saída                   |
----------------------------------------
| Livro     | Total da compra: R$40.5  |
| 45        |                          |
| 1         |                          |
----------------------------------------
| Air Fryer | Frete gratis aplicado    |
| 200       | Total da compra: R$200.0 |
| 2         |                          |
----------------------------------------
| Celular   | Total da compra: R$900.0 |
| 1000      |                          |
| 1         |                          |
----------------------------------------

SOLUÇÃO ABAIXO: */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface DiscountStrategy {
    double applyDiscount(double total);
}

class TenPercentDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double total) {
        return total * 0.9;
    }
}

class FreeShipping implements DiscountStrategy {
    @Override
    public double applyDiscount(double total) {
        System.out.println("Frete gratis aplicado");
        return total;
    }
}

class ShoppingCart {
    private List<Double> products = new ArrayList<>();
    private DiscountStrategy discountStrategy;

    public void addProduct(double price) {
        products.add(price);
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal() {
        double total = 0d;
        for(Double product : products)
            total += product;
        
        return discountStrategy.applyDiscount(total);
    }
}

public class CartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DiscountStrategy tenPercentDiscount = new TenPercentDiscount();
        DiscountStrategy freeShipping = new FreeShipping();

        ShoppingCart cart = new ShoppingCart();

        String productName = scanner.nextLine();
        double productPrice = scanner.nextDouble();
        cart.addProduct(productPrice);

        int strategyChoice = scanner.nextInt();
        
        scanner.close();

        switch (strategyChoice) {
            case 1:
                cart.setDiscountStrategy(tenPercentDiscount);
                break;
            case 2:
                cart.setDiscountStrategy(freeShipping);
                break;
            default:
                System.out.println("Escolha invalida. Nenhum desconto aplicado.");
        }
        
        double total = cart.calculateTotal();
        System.out.printf("Total da compra: R$%.1f", total);
    }
}