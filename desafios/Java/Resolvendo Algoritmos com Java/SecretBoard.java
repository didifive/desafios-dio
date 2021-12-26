/*
====================================================
Resolvendo Algoritmos com Java
====================================================
5/5 - O tabuleiro secreto
====================================================

Desafio
O senhor Milli, morador da cidade Petland, é o famoso proprietário da maior fábrica de jogos de tabuleiros do mundo. 
Recentemente, ele teve a ideia de lançar um novo jogo exclusivo de tabuleiro, que ele apelidou de Tabuleiro da Frequência.
O jogo ocorre da seguinte forma. Inicialmente, um tabuleiro com dimensões N × N é dado contendo apenas 0’s. Depois disso, Q operações são propostas, podendo ser de 4 tipos:

1 X R: Atribuir o valor R a todos os números da linha X;
2 X R: Atribuir o valor R a todos os números da coluna X;
3 X: Imprimir o valor mais frequente na linha X;
4 X: Imprimir o valor mais frequente da coluna X.

Milli não é muito bom com computadores, mas é bastante preguiçoso. Sabendo que você é um dos melhores programadores do mundo, ele precisa sua ajuda para resolver este problema.

Entrada
A primeira linha da entrada é composta por dois inteiros N e Q (1 ≤ N, Q ≤ 105), representando, respectivamente, o tamanho do tabuleiro e a quantidade de operações. As próximas Q linhas da entrada vão conter as Q operações. O primeiro inteiro de cada linha vai indicar o tipo da operação. Caso seja 1 ou 2, será seguido por mais dois inteiros X (1 ≤ X ≤ N) e R (0 ≤ R ≤ 50). Caso seja 3 ou 4, será seguido por apenas mais um inteiro X.

Saída
Para cada operação do tipo 3 ou 4, seu programa deve produzir uma linha, contendo o valor da resposta correspondente. Se uma linha ou coluna tiver dois ou mais valores que se repetem o mesmo número de vezes, você deve imprimir o maior deles. Por exemplo, se uma linha tem os valores [5,7,7,2,5,2,1,3], tanto o 2, 5 e 7 se repetem duas vezes, então a resposta será 7, pois é o maior deles.     

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 2 4                | 2                |
| 1 1 1              | 2                |
| 2 2 2              |                  |
| 3 1                |                  |
| 3 2                |                  |
-----------------------------------------
| 3 6                | 4                |
| 1 1 2              | 3                |
| 1 2 3              |                  |
| 1 3 4              |                  |
| 4 3                |                  |
| 1 3 0              |                  |
| 4 3                |                  |
-----------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecretBoard {

    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

        int boardSize = sc.nextInt();
        int operationsQuantity = sc.nextInt();

        Integer board[][] = new Integer[boardSize][boardSize];
        for(int i = 0; i < boardSize; i++) 
            for(int j = 0; j < boardSize; j++) board[i][j] = 0;
        sc.nextLine();
        for (int k=0; k<operationsQuantity; k++) {
            String operation = sc.nextLine();
            int operationType = Integer.parseInt(operation.split(" ")[0]);
            int lineColumn = (Integer.parseInt(operation.split(" ")[1])-1);
            int value = 0;
            if (operationType == 1 || operationType == 2)
                value = Integer.parseInt(operation.split(" ")[2]);
            switch (operationType){
                case 1:
                    for(int i = 0; i < boardSize; i++)
                        board[lineColumn][i] = value;
                    break;
                case 2:
                    for(int i = 0; i < boardSize; i++)
                        board[i][lineColumn] = value;
                    break;
                case 3:
                case 4:
                    valueMostFrequent(board,boardSize,operationType,lineColumn);
                    break;
                default:
                    System.out.println("Error!");
            }
        }
        sc.close();
    }

    static public void valueMostFrequent(
        Integer[][] board, 
        int boardSize, 
        int operationType,
        int lineColumn
    ){
        Map<Integer, Integer> uniqueFrequency = new HashMap<Integer, Integer>();
        for(int i = 0; i < boardSize; i++) {
            Integer pivot = operationType == 3 ? board[lineColumn][i] : board[i][lineColumn];
            if(uniqueFrequency.containsKey(pivot)) {
                Integer quantity = uniqueFrequency.get(pivot);
                quantity++;
                uniqueFrequency.put(pivot, quantity);
            } else {
                uniqueFrequency.put(pivot, 1);
            }
        }
        int maxValue = Collections.max(uniqueFrequency.values());
        List<Integer> max = uniqueFrequency.entrySet().stream()
            .filter(e -> e.getValue() == maxValue)
            .map(e -> e.getKey())
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
        System.out.println(max.get(0));
    }
}