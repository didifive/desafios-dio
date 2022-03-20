/* 
====================================================
Desafios - Aceleração Global Dev #23 - TQI
====================================================
3/3 - Teste de Seleção 1
====================================================

Desafio
Leia 4 valores inteiros A, B, C e D. Com base nisso, se o valor de B for maior do que de C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se tanto C quanto D forem positivos e, ainda, se a variável A for par, escreva a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.

Saída
Imprima a mensagem corretamente esperada pela validação dos valores.

--------------------------------------------
| Exemplo de Entrada | Exemplo de Saída    |
--------------------------------------------
| 5 6 7 8            | Valores nao aceitos |
--------------------------------------------
| 2 3 2 6            | Valores aceitos     |
--------------------------------------------

SOLUÇÃO ABAIXO: */

fun main(args: Array<String>) {

  val input = readLine()!!
  val split: List<String> = input.split(" ")
  val A: Int = split[0].toInt()
  val B: Int = split[1].toInt()
  val C: Int = split[2].toInt()
  val D: Int = split[3].toInt()
  
  if (B>C && D>A && (C+D)>(A+B) && C>0 && D>0 && A%2==0) {
    println("Valores aceitos")
  } else {
    println("Valores nao aceitos")
  }
}