/*
====================================================
Desafio Java - Cognizant Developer
====================================================
1/3 - Andando no Tempo
====================================================

Desafio
O seu instrutor de lógica de programação, Damilson Bonetti, quer que você desenvolva uma tela com as seguintes características:

Conter 39 traços horizontais ( - ) na primeira linha;
Conter um traço vertical ( | ) embaixo do primeiro traço e do trigésimo nono traço da primeira linha, preencher no meio com espaço em branco;
Repita o procedimento 2 quatro vezes;
Repita o procedimento 1.
No final deve ficar igual a imagem a seguir:

--------------------------------------- (39 traços)
|                                     |
|                                     |
|                                     |
|                                     |
|                                     |
--------------------------------------- (39 traços)

Entrada
Não há.

Saída
A saída será impresso conforme a figura acima.

-----------------------------------------------------------------
| Exemplo de Entrada | Exemplo de Saída                         |
-----------------------------------------------------------------
|                    | ---------------------------------------  |
|                    | |                                     |  |
|                    | |                                     |  |
|                    | |                                     |  |
|                    | |                                     |  |
|                    | |                                     |  |
|                    | ---------------------------------------  |
|                    |                                          |
-----------------------------------------------------------------

SOLUÇÃO ABAIXO: */

public class OutputOne {
	public static void main(String[] args) {
		String horizontalLine = "---------------------------------------";
		String verticalLine = "|                                     |";
		System.out.println(horizontalLine);
		for(int i=0;i<5;i++){
      System.out.println(verticalLine);
		}
		System.out.println(horizontalLine);
	}
}