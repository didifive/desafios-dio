/*
====================================================
Ordenação e Filtros em Java
====================================================
4/5 - Fila do Banco
====================================================

Desafio 
O banco que você trabalha sempre tem problemas para organizar as filas de atendimento dos clientes.
Após uma reunião com a gerência ficou decidido que os clientes ao chegar na agência receberão uma senha numérica em seu aparelho de celular via sms e que a ordem da fila será dada não pela ordem de chegada, mas sim pelo número recebido via sms. A ordem de atendimento será decrescente: aqueles que receberam número maior deverão ser atendidos primeiro. 
Então, dada a ordem de chegada dos clientes reordene a fila de acordo com o número recebido via sms, e diga quantos clientes não precisaram trocar de lugar nessa reordenação.

Entrada
A primeira linha contém um inteiro N, indicando o número de casos de teste a seguir.
Cada caso de teste inicia com um inteiro M (1 ≤ M ≤ 1000), indicando o número de clientes. Em seguida haverá M inteiros distintos Pi (1 ≤ Pi ≤ 1000), onde o i-ésimo inteiro indica o número recebido via sms do i-ésimo cliente.
Os inteiros acima são dados em ordem de chegada, ou seja, o primeiro inteiro diz respeito ao primeiro cliente a chegar na fila, o segundo inteiro diz respeito ao segundo cliente, e assim sucessivamente.

Saída
Para cada caso de teste imprima uma linha, contendo um inteiro, indicando o número de clientes que não precisaram trocar de lugar mesmo após a fila ser reordenada.
 
-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 3                  | 1                |
| 3                  | 0                |
| 100 80 90          | 4                |
| 4                  |                  |
| 100 120 30 50      |                  |
| 4                  |                  |
| 100 90 30 25       |                  |
-----------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BankQueue {
  
  static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  static PrintWriter out = new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException {
    
    int nClients, notChange, tests;
    int[] clients;
    Integer[] aux;
    StringTokenizer st;
    
    tests = toInt(read());
    
    for(int i=0;i<tests;i++){
      nClients = toInt(read());
      clients = new int[nClients];
      aux = new Integer[nClients];
      notChange = 0;
      st = new StringTokenizer(read());
      
      for (int j=0; j<nClients; j++){
        clients[j] = toInt(st.nextToken());
        aux[j] = (Integer)clients[j];
      }
      
      Arrays.sort(aux, Comparator.reverseOrder());
      
      for (int k=0;k<clients.length;k++)
        if (clients[k]==aux[k]) notChange++;
      
      out.println(notChange);
    }
    
    in.close();
    out.close();
  }

  private static String read() throws IOException {
      return in.readLine();
  }

  private static int toInt(String s) {
      return Integer.parseInt(s);
  }
}