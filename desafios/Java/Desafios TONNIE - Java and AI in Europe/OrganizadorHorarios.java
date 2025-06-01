/*
==============================================
Explorando Organização e Gestão com Java
==============================================
1/2 - Organizador de Horários para Reuniões
==============================================

Descrição
Você deve criar um programa que recebe uma lista de horários de reuniões agendadas durante o dia, cada uma representada por uma string no formato "HH:mm". Seu programa deve identificar e listar os horários únicos, ordenados do mais cedo ao mais tarde, ignorando horários repetidos.

Além disso, imprima quantos horários únicos foram informados.

Entrada
A primeira linha contém um número N, representando a quantidade de horários. Nas próximas N linhas, cada linha contém um horário no formato "HH:mm".

Um número inteiro N (quantidade de horários).
N linhas contendo um horário no formato "HH:mm".

Saída
Imprima os horários únicos ordenados, um por linha, e ao final uma linha com:
Total de horarios unicos: X, onde X é a quantidade de horários únicos.

Atenção: Os "horarios unicos" são os horários diferentes, ou seja, cada horário aparece uma única vez na listagem, mesmo que tenham sido informados múltiplas vezes na entrada. Dessa forma, a saída apresenta os horários distintos organizados do mais cedo ao mais tarde, eliminando duplicatas da entrada.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.
----------------------------------------------------
| Exemplo de Entrada | Exemplo de Saída            |
----------------------------------------------------
| 3                  | 12:00                       |
| 15:00              | 15:00                       |
| 12:00              | Total de horarios unicos: 2 |
| 15:00              |                             |
----------------------------------------------------
| 4                  | 09:00                       |
| 11:30              | 11:30                       |
| 09:00              | Total de horarios unicos: 2 |
| 11:30              |                             |
| 09:00              |                             |
----------------------------------------------------
| 5                  | 08:00                       |
| 08:00              | 09:00                       |
| 08:00              | 10:00                       |
| 08:00              | Total de horarios unicos: 3 |
| 09:00              |                             |
| 10:00              |                             |
----------------------------------------------------

Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

SOLUÇÃO ABAIXO:
*/

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class OrganizadorHorarios {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          int n = Integer.parseInt(sc.nextLine());
  
          Set<LocalTime> horarios = new TreeSet<>();
  
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
          
          for(int i = 0; i < n; i++) {
            horarios.add(LocalTime.parse(sc.next(), formatter));
          }
          
          horarios.forEach(h -> System.out.println(h.format(formatter)));
          
          System.out.printf("Total de horarios unicos: %d", horarios.size());
        
        }
    }
}