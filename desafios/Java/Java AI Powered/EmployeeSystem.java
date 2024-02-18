/*
Java AI Powered
========================================================
Desafios de Código Java Intermediários: S.O.L.I.D
========================================================
5/5 - Gerenciamento de Colaboradores
========================================================

Descrição
Desenvolva um programa para gerenciar colaboradores sob dois regimes de contratação distintos: Pessoa Jurídica (PJ) e Consolidação das Leis do Trabalho (CLT). O programa deve calcular os salários de acordo com o tipo de contrato fornecido pelo usuário e aplicar a lógica adequada para cada caso. Este desafio visa aplicar os princípios SOLID, como Single Responsibility, Open/Closed, Liskov Substitution e Interface Segregation na implementação do sistema, garantindo uma arquitetura flexível e fácil de manter.

Entrada
O programa deve receber como entrada o tipo de contrato (PJ ou CLT) seguido dos valores necessários para o cálculo do salário, conforme o seguinte formato:

Para PJ: o número de horas trabalhadas e o valor da hora, separados por vírgula.
Para CLT: o salário base e o valor das comissões, separados por vírgula.
Saída
A saída deve ser o valor do salário calculado de acordo com o tipo de contrato e os dados fornecidos. Por exemplo: CLT: 5462.0.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

------------------------------
| Entrada     | Saída        |
------------------------------
| CLT         | CLT: 5462.0  |
| 4942,520	  |              |
------------------------------
| PJ          | PJ: 6400.0   |
| 40,160	    |              |
------------------------------
| CLT         | CLT: 3124.54 |
| 2824.54,300	|              |
------------------------------

SOLUÇÃO ABAIXO: */

import java.util.Scanner;

interface Employee {
    double calculateSalary();
}

interface ContractType {
    double getSalary();
}

class CLTEmployee implements Employee {
    private final ContractType contractType;
    public CLTEmployee(ContractType contractType) {
        this.contractType = contractType;
    }
    @Override
    public double calculateSalary() {
        return contractType.getSalary();
    }
}

final class PJEmployee extends CLTEmployee{
    public PJEmployee(ContractType contractType) {
        super(contractType);
    }
}

final class CLT implements ContractType {
    private final double baseSalary;
    private final double commissions;
    public CLT(double baseSalary, double commissions) {
        this.baseSalary = baseSalary;
        this.commissions = commissions;
    }
    @Override
    public double getSalary() {
        return baseSalary + commissions;
    }
}

final class PJ implements ContractType {
    private final double workedHours;
    private final double hourlyRate;
    public PJ(double workedHours, double hourlyRate) {
        this.workedHours = workedHours;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double getSalary() {
        return workedHours * hourlyRate;
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        String contractType = "";
        String[] values = new String[2];
        try(Scanner scanner = new Scanner(System.in)) {
            contractType = scanner.nextLine();
            values = scanner.nextLine().split(",");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        if (contractType.equalsIgnoreCase("CLT")) {
            double baseSalary = Double.parseDouble(values[0]);
            double commissions = Double.parseDouble(values[1]);
            ContractType cltContract = new CLT(baseSalary, commissions);
            Employee cltEmployee = new CLTEmployee(cltContract);
            System.out.println("CLT: " + cltEmployee.calculateSalary());
        } else if (contractType.equalsIgnoreCase("PJ")) {
            double workedHours = Double.parseDouble(values[0]);
            double hourlyRate = Double.parseDouble(values[1]);
            ContractType pjContract = new PJ(workedHours, hourlyRate);
            Employee pjEmployee = new PJEmployee(pjContract);
            System.out.println("PJ: " + pjEmployee.calculateSalary());
        } else {
            System.out.println("Tipo de contrato inválido.");
        }
    }
}