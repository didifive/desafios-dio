/*
====================================================
Desafios Intermediários - Banco PAN Java Developer
====================================================
1/5 - Animal
====================================================

DESAFIO
Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.

imagem: animais.png

Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.
 
-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| vertebrado         | homem            |
| mamifero           |                  |
| onivoro            |                  |
-----------------------------------------
| vertebrado         | aguia            |
| carnivoro          |                  |
| onivoro            |                  |
-----------------------------------------
| invertebrado       | minhoca          |
| anelideo           |                  |
| onivoro            |                  |
-----------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class Animal {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String[] tipo = new String[3];
		
		String resultado = "";
		
		for (int i = 0; i < 3; i++) tipo[i] = sc.next();
		
		resultado = (tipo[0].equals("vertebrado"))
		            ? (tipo[1].equals("ave"))
		              ? (tipo[2].equals("carnivoro"))
		                ? "aguia"
		                : "pomba"
		              : (tipo[2].equals("onivoro"))
		                ? "homem"
		                : "vaca"
		            : (tipo[1].equals("inseto"))
		              ? (tipo[2].equals("hematofago"))
		                ? "pulga"
		                : "lagarta"
		              : (tipo[2].equals("hematofago"))
		                ? "sanguessuga"
		                : "minhoca";
		
		System.out.println(resultado);
		
		sc.close();
	}
}