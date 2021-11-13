/*
====================================================
Desafios Médios JavaScript
====================================================
3/3 - Teorema da Divisão Euclidiana
====================================================

Desafio
Você recebeu desafio de desenvolver um programa que calcule o quociente e o resto da divisão de dois números inteiros. Não se esqueça que o quociente e o resto da divisão de um inteiro a por um inteiro não-nulo b são respectivamente os únicos inteiros q e r tais que:
0 ≤ r < |b|
Se r < 0: r = r - |b|
a = b × q + r
q = ( a - r ) / b
Caso você não saiba, o teorema que garante a existência e a unicidade dos inteiros q e r é conhecido como ‘Teorema da Divisão Euclidiana’ ou ‘Algoritmo da Divisão’.
**|b| (Módulo / Valor absoluto): É o valor representado de forma positiva;

Entrada
A entrada é composta por dois números inteiros a e b (-1.000 ≤ a, b < 1.000).

Saída
Imprima o quociente q seguido pelo resto r da divisão de a por b, considerando as regras apresentadas a cima.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 7 3                | 2 1              |
-----------------------------------------
| 7 -3               | -2 1             |
-----------------------------------------
| -7 -3              | 3 2              |
-----------------------------------------

SOLUÇÃO ABAIXO: */

let line = gets().split(" ");
const a = parseInt(line[0]);
const b = parseInt(line[1]);

q = parseInt(a / b);
r = a % b;

if (r < 0) {
  r += Math.abs(b);
  q = ( a - r ) / b;
}

print(q + " " + r);
