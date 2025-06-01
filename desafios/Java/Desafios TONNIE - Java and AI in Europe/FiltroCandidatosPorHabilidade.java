/*
============================================================================
Explorando Programação Orientada a Objetos e Estruturas de Dados com Java
============================================================================
1/2 - Filtro de Candidatos por Habilidade
============================================================================

Desafio
Em um processo seletivo, o RH precisa buscar rapidamente os candidatos que possuem uma determinada habilidade. Você deve criar um programa que filtre os candidatos cadastrados com base em uma palavra-chave da habilidade.

Entrada
A entrada deve receber:

Uma primeira linha contendo dois valores separados por vírgula:

Um número inteiro N representando a quantidade de candidatos cadastrados.
Uma string representando a habilidade buscada.
As próximas N linhas conterão os dados dos candidatos no seguinte formato:

Nome-habilidade1,habilidade2,habilidade3...

A habilidade buscada e todas as habilidades dos candidatos devem ser comparadas ignorando maiúsculas e minúsculas.

Saída
Deverá retornar o nome de todos os candidatos que possuem a habilidade informada, um por linha, na ordem em que foram cadastrados.

Se nenhum candidato possuir a habilidade, exiba a mensagem: “Nenhum candidato encontrado”

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.
--------------------------------------------------------
| Exemplo de Entrada     | Exemplo de Saída            |
--------------------------------------------------------
| 3,java                 | Ana                         |
| Ana-java,sql,git       | Felipe                      |
| Clara-python,css,html  |                             |
| Felipe-java,spring,git |                             |
--------------------------------------------------------
| 2,excel                | Ana                         |
| Bruno-excel,powerpoint |                             |
| Ana-excel,word	       |                             |
--------------------------------------------------------
| 1,python               | Nenhum candidato encontrado |
| Pedro-java,html,css	   |                             |
--------------------------------------------------------

Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

SOLUÇÃO ABAIXO:
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FiltroCandidatosPorHabilidade {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          String[] primeiraLinha = scanner.nextLine().split(",");
          int n = Integer.parseInt(primeiraLinha[0].trim());
          String habilidadeBuscada = primeiraLinha[1].trim().toLowerCase();
  
          List<String> candidatosComHabilidade = new ArrayList<>();
  
          for (int i = 0; i < n; i++) {
              String[] partes = scanner.nextLine().trim().split("-", 2);
              String nome = partes[0].trim();
              
              if (partes.length > 1) {
                  String[] listaHabilidades = partes[1].trim().split(",");

                  for (String h : listaHabilidades) {
                      if(habilidadeBuscada.equalsIgnoreCase(h)) {
                        candidatosComHabilidade.add(nome);
                        break;
                      }
                  }
              }
          }
  
          if (candidatosComHabilidade.isEmpty()) {
              System.out.println("Nenhum candidato encontrado");
          } else {
              candidatosComHabilidade.forEach(System.out::println);
          }

        }
    }
}