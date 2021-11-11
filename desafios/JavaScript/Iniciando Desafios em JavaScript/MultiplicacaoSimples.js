/*
====================================================
Iniciando Desafios em JavaScript
====================================================
3/3 - Multiplicação Simples
====================================================

Desafio
Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores. Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).   

Entrada
A entrada contém 2 valores inteiros.

Saída
Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 3 9  	             | PROD = 27        |
-----------------------------------------
| -30 10             | PROD = -300      |
-----------------------------------------
| 0 9                | PROD = 0         |
-----------------------------------------

SOLUÇÃO ABAIXO: */

let valor1 = parseInt(gets());
let valor2 = parseInt(gets());
let total = valor1 * valor2;
console.log("PROD = " + total);
