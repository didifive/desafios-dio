/* 
====================================================
Aceleração Avanade - Microsserviços com Java
====================================================
1/3 - Quadrante
====================================================

Desafio
O plano cartesiano é feito por uma quantidade indeterminada de pontos. Ele é composto por quatro quadrantes como mostra a imagem abaixo. Desenvolva um programa que, dada as coordenadas de entrada (x, y), verifique em qual quadrante está situado o ponto.

<<quadrante.png>>

Caso uma das coordenadas seja NULA, o programa deve parar.

Entrada
As entradas serão 2 valores inteiros.

Saída
Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.
 
-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 2 2                | primeiro         |
-----------------------------------------
| 3 -2               | quarto           |
-----------------------------------------
| -8 -1              | terceiro         |
-----------------------------------------
| -7 1               | segundo          |
-----------------------------------------
| 0 2                |                  |
-----------------------------------------

SOLUÇÃO ABAIXO: */

import java.util.Scanner;

public class Quadrant {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();
        
        while (x != 0 && y != 0){
            String quadrant = "";
            
            if (x>0) quadrant = (y>0) ? "primeiro" : "quarto";
            else quadrant = (y>0) ? "segundo" : "terceiro";
            
            System.out.println(quadrant);
            
            x = reader.nextInt();
            y = reader.nextInt();
        }

        reader.close();
    }
}