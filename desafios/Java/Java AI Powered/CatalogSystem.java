/*
Java AI Powered
========================================================
Desafios de Código Java Intermediários: Design Patterns
========================================================
3/5 - Implementando um Catálogo de Produtos com Padrão Observer
========================================================

Descrição
Você deve aprimorar o sistema de monitoramento de produtos, adicionando a capacidade de exibir uma mensagem específica para cada usuário quando um novo produto é adicionado ao catálogo. Além disso, implemente a funcionalidade de permitir que os usuários cancelem sua assinatura para deixar de receber notificações sobre novos produtos.

Entrada
O programa deve solicitar ao usuário que insira o nome do usuário para realizar a ação desejada.
Se o usuário deseja cancelar a assinatura, ele deve digitar "cancelar". Se desejar receber notificações, deve digitar qualquer outro valor.
Se o usuário optar por adicionar um novo produto, será solicitado o nome do produto a ser adicionado.
Saída
Após cada ação, o programa deve exibir mensagens informativas para indicar se a assinatura foi cancelada com sucesso, se o usuário ainda está assinando notificações ou se o produto foi adicionado ao catálogo.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

---------------------------------------------------------------------------
| Entrada    |  Saída                                                     |
---------------------------------------------------------------------------
| TV         | Notificacao recebida: Novo produto adicionado - TV         |
| Smart      |                                                            |
| 999        |                                                            |
| S          |                                                            |
---------------------------------------------------------------------------
| Smartphone | Notificacao recebida: Novo produto adicionado - Smartphone |
| Apple      |                                                            |
| 3000       |                                                            |
| S          |                                                            |
---------------------------------------------------------------------------
| Mouse      | Programa Encerrado.                                        |
| Sem fio    |                                                            |
| 340        |                                                            |
| N          |                                                            |
---------------------------------------------------------------------------

SOLUÇÃO ABAIXO: */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Observer {
    void update(String productName);
}

class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String productName) {
        System.out.println("Notificacao recebida: Novo produto adicionado - " + productName);
    }
}

interface CatalogObservable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String productName);
}

class Catalog implements CatalogObservable {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String productName) {
        for(Observer observer : observers)
            observer.update(productName);
    }

    public void addProduct(String name, String description, double price, String subscribeChoice) {
        if (subscribeChoice.equals("S"))
            notifyObservers(name);
        else
            System.out.println("Programa Encerrado.");
    }
}

public class CatalogSystem {
    public static void main(String[] aargs) {
        Scanner scanner = new Scanner(System.in);

        Catalog catalog = new Catalog();
        User user = new User("Usuário 1");

        catalog.addObserver(user);

        String name = scanner.nextLine();
        String description = scanner.nextLine();
        double price = scanner.nextDouble();

        scanner.nextLine();
        String subscribeChoice = scanner.nextLine();
        
        scanner.close();
       
        catalog.addProduct(name, description, price, subscribeChoice);
    }
}