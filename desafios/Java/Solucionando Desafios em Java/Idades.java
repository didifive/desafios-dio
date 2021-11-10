/*
====================================================
Solucionando Desafios em Java
====================================================
2/3 - Idades
====================================================

Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.

A média deve ser impressa com dois dígitos após o ponto decimal.
 
--------------------------------------------
| Exemplo de Entrada | Exemplo de Saída    |
--------------------------------------------
| 34                 | 39.25               |
| 56                 |                     |
| 44                 |                     |
| 23                 |                     |
| -2                 |                     |
--------------------------------------------

Agradecimentos a Cassio F.

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.Locale;
import java.util.Iterator;
import java.util.stream.Stream;

public class  Idades {
	
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
		    Locale.setDefault(new Locale("en", "US"));
        List<Integer> valores = new ArrayList<Integer>();
        while (sc.hasNextLine()) {
            valores.add(Integer.parseInt(sc.nextLine()));
        }
        valores.removeIf(i -> i < 0);
      
        Iterator<Integer> posicao = valores.iterator();
        Integer soma = 0;
        Integer qtde = 0; 
        while (posicao.hasNext()){
           soma += (Integer)posicao.next();
           qtde++;
        }
        
        Double somaDouble = Double.valueOf(soma);
        Double qtdeDouble = Double.valueOf(qtde);

        Double media = somaDouble/qtdeDouble;
        System.out.println(String.format("%.2f", media));
    }
}
