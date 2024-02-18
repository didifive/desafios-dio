/*
Java AI Powered
========================================================
Desafios de Código Java Intermediários: S.O.L.I.D
========================================================
4/5 - Princípio de Substituição de Liskov (LSP)
========================================================

Descrição
O Princípio da Substituição de Liskov (LSP), um dos cinco princípios S.O.L.I.D. de design de software propostos por Barbara Liskov, afirma que objetos de uma classe base devem ser substituíveis por objetos de suas classes derivadas sem afetar a integridade do programa. Em outras palavras, se uma classe S é uma subclasse de uma classe T, então um objeto do tipo T pode ser substituído por um objeto do tipo S sem alterar a correção do programa. Isso implica que as subclasses devem herdar comportamentos da classe base e também podem estender esses comportamentos, mas não devem modificar seu contrato original.

No desafio proposto, seguindo os princípios do LSP e utilizando convenções brasileiras para nomes de entrada, crie uma classe base para Polígono e classes para diferentes formas geométricas, Retângulo e Quadrado, que podem ser usadas de forma intercambiável sem quebrar a funcionalidade. Ao aderir ao LSP, os desenvolvedores garantem uma hierarquia de classes coesa e flexível, tornando a manutenção do código mais fácil e promovendo a reutilização. O LSP contribui para a construção de sistemas mais robustos e extensíveis, fornecendo uma base sólida para herança e polimorfismo no desenvolvimento orientado a objetos.

Entrada
Tipo de forma (string): quadrado ou retangulo, e medidas (int): largura e altura para retângulos, lado para quadrados. As informações de entrada são separadas por vírgula.

Saída
A saída deverá ser a Área da forma (int).

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

----------------------------
| Entrada          | Saída |
----------------------------
| retangulo, 7, 7  | 49    |
----------------------------
| retangulo, 5, 10 | 50    |
----------------------------
| quadrado, 4      | 16    |
----------------------------

SOLUÇÃO ABAIXO: */

import java.util.Scanner;

// LSP: Classe base representando um polígono.
abstract class Poligono {
  abstract int calcularArea();
}

// LSP: Classe derivada para retângulos
class Retangulo extends Poligono {
    private int largura;
    private int altura;
  
    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }
  
    @Override
    public int calcularArea() {
        return largura * altura;
    }
}

// LSP: Classe derivada para quadrados, herdando de Retangulo
class Quadrado extends Retangulo {
    public Quadrado(int lado) {
      super(lado,lado);
    }
}

public class LSP{
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String[] entradas = scanner.nextLine().split(", ");
      String tipoForma = entradas[0];

      Poligono poligono;
      if (tipoForma.equals("retangulo")) {
        int largura = Integer.parseInt(entradas[1]);
        int altura = Integer.parseInt(entradas[2]);
        poligono = new Retangulo(largura, altura);
      } else if (tipoForma.equals("quadrado")) {
        int lado = Integer.parseInt(entradas[1]);
        poligono = new Quadrado(lado);
      } else {
        throw new IllegalArgumentException("Tipo de forma inválido.");
      }
      int area = poligono.calcularArea();
      System.out.println(area);
    }
  }
}