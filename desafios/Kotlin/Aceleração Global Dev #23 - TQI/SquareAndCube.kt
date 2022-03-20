/* 
====================================================
Desafios - Aceleração Global Dev #23 - TQI
====================================================
1/3 - Quadrado e ao Cubo
====================================================

Desafio
Você terá o desafio de escrever um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 5                  | 1 1 1            |
|                    | 2 4 8            |
|                    | 3 9 27           |
|                    | 4 16 64          |
|                    | 5 25 125         |
-----------------------------------------

SOLUÇÃO ABAIXO: */

fun main(args: Array<String>) {
	val r = readLine()!!.toInt()
	for (i in 1..r) {
		var s = Math.pow(i.toDouble(),2.toDouble())
		var c = Math.pow(i.toDouble(),3.toDouble())
		var square = "%.0f".format(s)
		var cube = "%.0f".format(c)
		print("$i $square $cube\n")
	}
}