/*
====================================================
Solucionando desafios matemáticos em Java
====================================================
4/5 - Múltiplos
====================================================

Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.

--------------------------------------------
| Exemplo de Entrada | Exemplo de Saída    |
--------------------------------------------
| 6 24               | Sao Multiplos       |
--------------------------------------------
| 6 25               | Nao sao Multiplos   |
--------------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class Multiplos{
    
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        String[] valores = new String[2];
        
        valores = leitor.nextLine().split(" ");
        
        int valorA = Integer.parseInt(valores[0]);
        int valorB = Integer.parseInt(valores[1]);
        int resto = valorB%valorA;
        int resto2 = valorA%valorB;
        
        if (resto == 0 || resto2 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
