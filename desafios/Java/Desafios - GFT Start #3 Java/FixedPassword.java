/*
====================================================
Desafios - GFT Start #3 Java
====================================================
3/3 - Senha Fixa
====================================================

Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. 

Entrada
A entrada é composta por vários casos de testes contendo valores inteiros.

Saída
Para cada valor lido mostre a mensagem correspondente à descrição do problema.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 2200               | Senha Invalida   |
| 1020               | Senha Invalida   |
| 2022               | Senha Invalida   |
| 2002               | Acesso Permitido |
-----------------------------------------
Formatação e inserção no portal por Cássio Favaretto.

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class FixedPassword {

  public static void main(String[] args) throws IOException {
  	Scanner leitor = new Scanner(System.in);
  	int password;

    while (leitor.hasNext()) {
      password = leitor.nextInt();
      if (password == 2002) {
        System.out.println("Acesso Permitido");
        break;
      } else {
        System.out.println("Senha Invalida");
      }
  	}
  	
    leitor.close();
  }
}