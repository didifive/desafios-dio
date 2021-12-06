/*
====================================================
Resolvendo Desafios Básicos em JavaScript
====================================================
2/3 - Teste de Seleção 1
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
| 2 3 2 6	           | Valores aceitos     |
--------------------------------------------

SOLUÇÃO ABAIXO: */

const x = gets().split(" ");
const a = parseInt(x[0]);
const b = parseInt(x[1]);
const c = parseInt(x[2]);
const d = parseInt(x[3]);

if (b>c && d>a && (c+d)>(a+b) && c>0 && d>0 && a%2===0){
  print("Valores aceitos");
}else{
  print("Valores nao aceitos");
}