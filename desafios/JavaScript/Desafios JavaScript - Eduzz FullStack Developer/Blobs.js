/*
====================================================
Desafios JavaScript - Eduzz FullStack Developer
====================================================
2/3 - Blobs
====================================================

No planeta Alpha vive a criatura Blobs, que come precisamente 1/2 de seu suprimento de comida disponível todos os dias. Escreva um algoritmo que leia a capacidade inicial de suprimento de comida (em Kg), e calcule quantos dias passarão antes que Blobs coma todo esse suprimento até restar um quilo ou menos.

Entrada
A primeira linha de entrada contem um único inteiro N (1 ≤ N ≤ 1000), indicando o número de casos de teste. As N linhas seguintes contém um valor de ponto flutuante C (1 ≤ C ≤ 1000) correspondente à quantidade de comida disponível para Blobs.

Saída
Para cada caso de teste, imprima uma linha contendo o número de dias que Blobs irá demorar para comer todo seu suprimento de comida, seguido da palavra "dias".

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 3                  | 6 dias           |
| 40.0               | 8 dias           |
| 200.0              | 9 dias           |
| 300.0              |                  |
-----------------------------------------

SOLUÇÃO ABAIXO: */

var n = parseInt(gets());

for (let i=0;i<n;i++) {
  var c = parseFloat(gets());
  var dias = 0;
  while (c > 1) {
    c = c / 2.0;
    dias++;
  }
  print(`${dias} dias`);
}