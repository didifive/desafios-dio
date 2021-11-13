/*
====================================================
Desafios Aritméticos em JavaScript
====================================================
3/3 - Programa para Validação de Notas
====================================================

Desafio
O calendário escolar está passando bem rápido, devido a isso, as professoras de uma escola estão com dificuldade para calcular as notas dos alunos. Visando em resolver a situação, a diretora da escola contratou você para desenvolver um programa que leia as notas da primeira e da segunda avaliação de um aluno. Calcule e imprima a média semestral.
O programa só aceitará notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.
No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando as professoras que informe um código (1 ou 2) indicando se ele deseja ou não executar o algoritmo novamente, (aceitar apenas os código 1 ou 2). Se for informado o código 1 deve ser repetida a execução de todo o programa para permitir um novo cálculo, caso contrário o programa deve ser encerrado.

Entrada
O arquivo de entrada contém vários valores reais, positivos ou negativos. Quando forem lidas duas notas válidas, deve ser lido um valor inteiro X . O programa deve parar quando o valor lido para este X for igual a 2.

Saída
Se uma nota inválida for lida, deve ser impressa a mensagem “nota invalida”. Quando duas notas válidas forem lidas, deve ser impressa a mensagem “media = ” seguido do valor do cálculo.
Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim 2-nao)" e esta mensagem deve ser apresentada novamente se o valor da entrada padrão para X for menor do que 1 ou maior do que 2, conforme o exemplo abaixo.
A média deve ser impressa com dois dígitos após o ponto decimal.
 
----------------------------------------------------
| Exemplo de Entrada | Exemplo de Saída            |
----------------------------------------------------
| -3.5               | nota invalida               |
| 3.5                | nota invalida               |
| 11.0               | media = 6.75                |
| 10.0               | novo calculo (1-sim 2-nao)  |
| 4                  | novo calculo (1-sim 2-nao)  |
| 1                  | media = 8.50                |
| 8.0                | novo calculo (1-sim 2-nao)  |
| 9.0                |                             |
| 2                  |                             |
----------------------------------------------------

SOLUÇÃO ABAIXO: */

let getout = false;
let numA = null;
let numB = null;

while (!getout) {
  const input = gets();
  const isValid = (value) => value <= 10 && value >= 0;

  if (!isValid(input)) {
    console.log("nota invalida");
    continue;
  }

  if (!numA) {
    numA = Number(input);
    continue;
  }

  numB = Number(input);
  
  const average = (numA + numB) / 2  
  
  numA = null;
  numB = null;
  
  console.log("media = " + average.toFixed(2));

  let validResponse = false;
  let response = null;
  
  do {
    console.log('novo calculo (1-sim 2-nao)');
    response = gets();

    switch (response) {
      case "1":
        validResponse = true;
        break;
      case "2":
        validResponse = true;
        getout = true;
        break;
    }
    
  } while (!validResponse);
}
