/*
====================================================
Desafios - GFT Start #3 Java
====================================================
1/3 - Fases da Lua
====================================================

Jade ganhou de presente de aniversário um telescópio e ficou muito feliz, pois adora olhar a lua à noite. Ela sempre foi uma estudante muito boa, e só analizando a lua por duas noites seguidas, já consegue identificar as mudanças que ocorreram na iluminação e o percentual aproximado da lua que está iluminada.
Você, que é amigo da Jade e estuda Computação, resolveu fazer um pequeno programa que, baseado nesta avaliação que ela fez nas duas últimas noites, informa a fase na qual a lua se encontra. Se a porção visível da lua no momento estiver entre 0 e 2%, por exemplo, é lua nova, se for entre 3 e 96% é lua crescente, se for entre 97 e 100% é lua cheia e se for entre 96 e 3% (diminuindo) é lua minguante.

Entrada
A entrada é composta por uma única linha contendo dois valores inteiros. O primeiro valor corresponde ao percentual observado por Jade na noite de dois dias atrás. O segundo valor corresponde ao percentual observado por jade na noite anterior.

Saída
Baseado nos dois percentuais observados por Jade, imprima na tela a fase na qual a lua se encontrava na noite anterior, conforme o exemplo abaixo. Não esqueça de imprimir o caractere de fim de linha após a saída :).

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 0 2                | nova             |
-----------------------------------------
| 2 3                | crescente        |
-----------------------------------------
| 99 97              | cheia            |
-----------------------------------------
| 97 94              | minguante        |
-----------------------------------------
| 30 35              | crescente        |
-----------------------------------------
Contest Oficial de Aquecimento da Olimpíada Brasileira de Informática, Fase 2, 2015

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class MoonPhases {

  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    
    String moonPhase;
    int inicio = leitor.nextInt();
    int fim = leitor.nextInt();

    moonPhase = (inicio >= 0 && fim <= 2) ? "nova"
                  : (fim > inicio && fim <= 96) ? "crescente"
                  : (fim < inicio && fim <= 96) ? "minguante"
                  : "cheia";

    System.out.println(moonPhase);
    
    leitor.close();
  }
}