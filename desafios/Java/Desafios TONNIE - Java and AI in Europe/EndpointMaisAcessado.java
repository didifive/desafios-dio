/*
==============================================
Aplicando Manipulação de Endpoints com Java
==============================================
2/2 - Contagem de Requisições por Endpoint
==============================================

Descrição
Receba uma lista de strings representando endpoints acessados e retorne o endpoint mais acessado. Se houver empate, retorne o que apareceu primeiro na lista.

Entrada
Uma linha com nomes de endpoints separados por espaço.

Uma linha contendo os nomes dos endpoints separados por espaço.

Saída
O nome do endpoint mais acessado.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.
------------------------------------------------------
| Exemplo de Entrada              | Exemplo de Saída |
------------------------------------------------------
| /login /home /login /profile    | /login           |
------------------------------------------------------
| /api /api /home /api            | /api             |
------------------------------------------------------
| /dashboard /settings /dashboard | /dashboard       |
------------------------------------------------------

Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

SOLUÇÃO ABAIXO:
*/

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EndpointMaisAcessado {
    public static void main(String[] args) {
      try(Scanner sc = new Scanner(System.in)) {

        String[] endpointsAcessados = sc.nextLine().trim().split(" ");

        Map<String, Integer> endpointsMap = new LinkedHashMap<>();
        
        for(int i = 0; i < endpointsAcessados.length; i++) {
          endpointsMap.compute(endpointsAcessados[i], (k, v) -> (v == null) ? 1 : ++v);
        }

        String maisAcessado = endpointsMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println(maisAcessado);

      }
    }
}