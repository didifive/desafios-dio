/*
====================================================
Desafios - GFT QA #1
====================================================
6/6 - Tempo de Jogo
====================================================

Desafio
Tento como base a hora inicial e final de um jogo, calcule a duração do dele, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de, 60 minutos e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.

------------------------------------------------
| Exemplo de Entrada | Exemplo de Saída        |
------------------------------------------------
| 16 2               | O JOGO DUROU 10 HORA(S) |
------------------------------------------------
| 0 0                | O JOGO DUROU 24 HORA(S) |
------------------------------------------------
| 2 16               | O JOGO DUROU 14 HORA(S) |
------------------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class GameTime {
	public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
		int inicio, fim, horas;
		inicio = scan.nextInt();
		fim = scan.nextInt();
		horas = fim-inicio;

		if(horas == 0) System.out.println("O JOGO DUROU 24 HORA(S)");
		else if(horas < 0) System.out.printf("O JOGO DUROU %d HORA(S)\n",(24-inicio+fim));
		else System.out.printf("O JOGO DUROU %d HORA(S)\n",horas);
		
		scan.close();
	}
}