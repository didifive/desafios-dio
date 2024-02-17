/*
Java AI Powered
========================================================
Desafios de Código Java Intermediários: Design Patterns
========================================================
2/5 - Implementando uma Calculadora Simples com Padrão Strategy
========================================================

Descrição
Você foi designado para criar uma calculadora simples em Java, aplicando o padrão de projeto Strategy para representar as operações matemáticas.

Entrada
O programa deve solicitar ao usuário dois números e a operação desejada. As operações podem ser especificadas pelos seguintes sinais: + para soma, - para subtração, * para multiplicação e / para divisão. O usuário deve inserir o sinal correspondente à operação desejada.

Saída
A calculadora deve utilizar o padrão Strategy para realizar a operação escolhida e exibir o resultado.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

--------------------
| Entrada |  Saída |
--------------------
| 100     | 10.0   |
| 10      |        |
| /       |        |
--------------------
| 9       | 36.0   |
| 4       |        |
| *       |        |
--------------------
| 4       | 7.0    |
| 3       |        |
| +       |        |
--------------------


SOLUÇÃO ABAIXO: */

import java.util.Scanner;

interface Operation {
    double execute(double num1, double num2);
}

class AddOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return num1 + num2;
    }
}

class SubtractOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return num1 - num2;
    }
}

class MultiplyOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return num1 * num2;
    }
}

class DivideOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return num1 / num2;
    }
}

class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double performOperation(double num1, double num2) {
        return operation.execute(num1, num2);
    }
}

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Operation addOperation = new AddOperation();
        Operation subtractOperation = new SubtractOperation();
        Operation multiplyOperation = new MultiplyOperation();
        Operation divideOperation = new DivideOperation();

        Calculator calculator = new Calculator();

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        String operationChoice = scanner.next();
        
        scanner.close();

        switch (operationChoice) {
            case "+":
                calculator.setOperation(addOperation);
                break;
            case "-":
                calculator.setOperation(subtractOperation);
                break;
            case "*":
                calculator.setOperation(multiplyOperation);
                break;
            case "/":
                calculator.setOperation(divideOperation);
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        double result = calculator.performOperation(num1, num2);
        System.out.printf("%.1f",result);
    }
}