/*
====================================================
Desafio Java - Bootcamp Amdocs
====================================================
2/3 - A Mudança Continua!!
====================================================

[turnstime.png]

Novamente Júlio pede sua ajuda, ele esqueceu de um pequeno detalhe. Como o seu o programa anterior só informava uma saudação, ele pediu que transformasse o grau do Sol/Lua em HH:MM:SS. Então caso aceite: dado um grau relativo a posição do Sol/Lua, refaça o sistema só que agora além da saudação de cada período do dia, informe exatamente as horas, os minutos e segundos.

Entrada
A entrada contem um pontos flutuantes M (0 ≥ M < 360) representando a posição, em graus,do Sol/Lua em relação a terra. Como eles andam em constante movimento seu programa receberá diversos casos a cada segundo(EOF).

Saída
Imprima qual período do dia ele se encontra: "Boa Tarde!!", "Boa Noite!!", "Bom Dia!!" e "De Madrugada!!", e na linhas de baixo exiba as horas, minutos e segundos (HH:MM:SS).

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 1.50               | Bom Dia!!        |
| 95.5               | 06:06:00         |
| 187.5              | Boa Tarde!!      |
| 279.5              | 12:22:00         |
| 180                | Boa Noite!!      |
|                    | 18:30:00         |
|                    | De Madrugada!!   |
|                    | 00:38:00         |
-----------------------------------------
Primeiro Contest Sam Well - IFSULDEMINAS

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class TurnsTimeUpdate{
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	while (leitor.hasNext()) {
    		double graus = Math.abs(leitor.nextDouble());
    		
    		if (graus <= 360) {
	    		String salutation;
      		if (graus >= 90 && graus < 180) salutation = "Boa Tarde!!" ;
      		else if (graus >= 180 && graus < 270) salutation = "Boa Noite!!" ;
          else if (graus >= 270 && graus < 360) salutation = "De Madrugada!!" ;
          else salutation = "Bom Dia!!";
	    		    
	    		Double horas = (graus/15)+6d;
	    		if (horas>23) horas -= 24d;
	    		Double minutos = (horas-horas.intValue())*60;
	    		Double segundos = (minutos-minutos.intValue())*60;
	    		
	    		System.out.printf("%s%n%02d:%02d:%02d%n", salutation, horas.intValue(), minutos.intValue(), segundos.intValue());
    		}
    	}
    	leitor.close();
    }
}