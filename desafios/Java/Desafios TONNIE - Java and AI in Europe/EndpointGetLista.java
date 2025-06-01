/*
==============================================
Aplicando Manipulação de Endpoints com Java
==============================================
1/2 - Simulação de Endpoint GET
==============================================

Descrição
Simule um endpoint que recebe uma lista de nomes e retorna a lista ordenada alfabeticamente, formatada como um array JSON simples.

Entrada
Uma linha com nomes separados por espaço.

Uma linha contendo nomes separados por espaço.

Saída
Os nomes ordenados alfabeticamente, formatados como uma lista JSON, ou seja, entre colchetes [] e cada nome entre aspas duplas, separados por vírgulas e espaços.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.
-----------------------------------------------------
| Exemplo de Entrada | Exemplo de Saída             |
-----------------------------------------------------
| Carlos Ana Beatriz | ["Ana", "Beatriz", "Carlos"] |
-----------------------------------------------------
| Maria Joao Pedro   | ["Joao", "Maria", "Pedro"]   |
-----------------------------------------------------
| Zeca Ana Ana	     | ["Ana", "Ana", "Zeca"]       |
-----------------------------------------------------

Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

SOLUÇÃO ABAIXO:
*/

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EndpointGetLista {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
          List<String> nomesSaida = Arrays.asList(sc.nextLine().split(" "));
          
          nomesSaida.sort(String::compareTo);
          
          String saida = nomesSaida.stream()
              .map(s -> "\"" + s + "\"")
              .collect(Collectors.joining(", "));
          
          System.out.printf("[%s]",saida);
        }
    }
}