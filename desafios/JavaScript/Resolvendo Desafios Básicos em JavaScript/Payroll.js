/*
====================================================
Resolvendo Desafios Básicos em JavaScript
====================================================
3/3 - Folha de Pagamento
====================================================

Desafio
Precisamos saber quanto uma determinada empresa deve pagar para seus colaboradores, porém temos apenas a quantidade de horas trabalhadas e o valor hora. Escreva um programa que leia o número de um colaborador, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse colaborador. Em seguida, apresente o número e o salário do colaborador, com duas casas decimais.

Entrada
Você receverá 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada.

Saída
Exiba o número e o salário do colaborador, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.
 
---------------------------------------------
| Exemplo de Entrada | Exemplo de Saída     |
---------------------------------------------
| 25                 | NUMBER = 25          |
| 100                | SALARY = U$ 550.00   |
| 5.50               |                      |
---------------------------------------------
| 1                  | NUMBER = 1           |
| 200                | SALARY = U$ 4100.00  |
| 20.50              |                      |
---------------------------------------------
| 6                  | NUMBER = 6           |
| 145                | SALARY = U$ 2254.75  |
| 15.55              |                      |
---------------------------------------------

SOLUÇÃO ABAIXO: */

const registration = parseInt(gets());
const workedHours = parseInt(gets());
const valuePerHour = parseFloat(gets());

const salary = workedHours * valuePerHour;

print("NUMBER = "+registration+"\nSALARY = U$ "+salary.toFixed(2));