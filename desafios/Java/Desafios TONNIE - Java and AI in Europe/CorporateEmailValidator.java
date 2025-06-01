/*
====================================================
Explorando a Sintaxe Básica de Java
====================================================
1/2 - Validador de E-mail Corporativo
====================================================

Desafio
Sua empresa exige que todos os funcionários utilizem e-mails corporativos com o domínio @company.com. O objetivo deste desafio é criar um programa que valide se o e-mail informado corresponde ao domínio correto. Caso o e-mail não tenha o domínio correto, o sistema deverá indicar que o domínio não é válido.

Entrada
A entrada é um e-mail no formato nome@domínio.

Saída
O programa deve verificar se o e-mail contém o domínio @company.com. Se o domínio for correto, retorna "E-mail valido", caso contrário, retorna "E-mail invalido".

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.
------------------------------------------------
| Exemplo de Entrada        | Exemplo de Saída |
------------------------------------------------
| joao.silva@company.com    | E-mail valido    |
| maria.silva@exemplo.com   | E-mail invalido  |
| pedro.almeida@company.com | E-mail valido    |
------------------------------------------------
Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

SOLUÇÃO ABAIXO:
*/

import java.util.Scanner;

public class CorporateEmailValidator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String email = scanner.nextLine().trim();
            
            boolean isValid = email.matches("^[\\w.-]+@company\\.com$");
            
            System.out.printf("E-mail %s", isValid ? "valido" : "invalido");
        } 
    }
}