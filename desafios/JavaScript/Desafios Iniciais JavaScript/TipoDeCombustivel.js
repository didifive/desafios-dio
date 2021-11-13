/*
====================================================
Desafios Iniciais JavaScript
====================================================
3/3 - Tipo de Combustível
====================================================

Desafio
Você recebeu desafio para determinar qual dos produtos é o preferêncial dos clientes de um posto de abastecimento de combustível. Para isso você deve escrever um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
 
-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 8                  | MUITO OBRIGADO   |
| 1                  | Alcool: 1        |
| 7                  | Gasolina: 2      |
| 2                  | Diesel: 0        |
| 2                  |                  |
| 4                  |                  |
-----------------------------------------

SOLUÇÃO ABAIXO: */

let X = 0;
let alcool = 0;
let gasolina = 0;
let diesel = 0;

while (X !== 4) {
  X = parseInt(gets());
  if (X === 1) {
    alcool++;
  } else if (X === 2) {
    gasolina++;
  } else if (X === 3) {
    diesel++;
  }  
}

print("MUITO OBRIGADO");
print("Alcool: " + alcool);
print("Gasolina: " + gasolina);
print("Diesel: " + diesel);
