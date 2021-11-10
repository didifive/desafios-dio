/*
====================================================
Solucionando Desafios em Java
====================================================
1/3 - Diferença
====================================================

Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.

--------------------------------------------
| Exemplo de Entrada | Exemplo de Saída    |
--------------------------------------------
| 5                  | DIFERENCA = -26     |
| 6                  |                     |
| 7                  |                     |
| 8                  |                     |
--------------------------------------------
| 0                  | DIFERENCA = -56     |
| 0                  |                     |
| 7                  |                     |
| 8                  |                     |
--------------------------------------------
| 5                  | DIFERENCA = 86      |
| 6                  |                     |
| -7                 |                     |
| 8                  |                     |
--------------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class Diferenca {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        int ab = a * b;
        int cd = c * d;
        int diferenca = ab-cd;
        
        System.out.println("DIFERENCA = "+ diferenca);
    }
	
}
