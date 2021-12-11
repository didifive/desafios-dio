/*
====================================================
Fundamentos Aritméticos em Java
====================================================
3/5 - Uniformes de final de ano
====================================================

Desafio
O professor Girafales organizou a confecção de um uniforme para as turmas da escola para comemorar o final do ano. Após algumas conversas, ficou decidido com os alunos que eles poderiam escolher a cor do uniforme entre branco ou vermelho. Assim sendo, Girafales precisa de sua ajuda para organizar as listas de quem quer o uniforme em cada uma das turmas, relacionando estas camisetas pela cor, tamanho (P, M ou G) e por último pelo nome.

Entrada
Cada caso de teste inicia com um valor N, (1 ≤ N ≤ 60) inteiro e positivo, que indica a quantidade de uniformes a serem feitas para aquela turma. As próximas N*2 linhas contém informações de cada um dos uniformes (serão duas linhas de informação para cada uniforme). A primeira linha irá conter o nome do estudante e a segunda linha irá conter a cor do uniforme ("branco" ou "vermelho") seguido por um espaço e pelo tamanho do uniforme "P" "M" ou "G". A entrada termina quando o valor de N for igual a zero (0) e esta valor não deverá ser processado.

Saída
Para cada caso de entrada deverão ser impressas as informações ordenadas pela cor em ordem ascendente, seguido pelos tamanhos em ordem descendente e por último por ordem ascendente de nome, conforme o exemplo abaixo.

------------------------------------------------------
| Exemplo de Entrada | Exemplo de Saída              |
------------------------------------------------------
| 9                  | branco P Cezar Torres Mo      |
| Maria Jose         | branco P Maria Jose           |
| branco P           | branco M JuJu Mentina         |
| Mangojata Mancuda  | branco G Adabi Finho          |
| vermelho P         | branco G Severina Rigudinha   |
| Cezar Torres Mo    | vermelho P Amaro Dinha        |
| branco P           | vermelho P Baka Lhau          |
| Baka Lhau          | vermelho P Carlos Chade Losna |
| vermelho P         | vermelho P Mangojata Mancuda  |
| JuJu Mentina       |                               |
| branco M           |                               |
| Amaro Dinha        |                               |
| vermelho P         |                               |
| Adabi Finho        |                               |
| branco G           |                               |
| Severina Rigudinha |                               |
| branco G           |                               |
| Carlos Chade Losna |                               |
| vermelho P         |                               |
| 0                  |                               |
------------------------------------------------------

SOLUÇÃO ABAIXO: */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class EndYearUniforms {
  
  static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  static PrintWriter out = new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException {
    
    String owner, l, color, size;
    Tshirt[] tshirts;
    int N;
    
    while (!(l = read()).equals("0")) {
      N = toInt(l);
      tshirts = new Tshirt[N];
      for (int i = 0; i < N; i++) {
        owner = read();
        StringTokenizer st = new StringTokenizer(read());
        color = st.nextToken();
        size = st.nextToken();
        tshirts[i] = new Tshirt(size, color, owner);
      }
      Arrays.sort(tshirts, new Comparator<Tshirt>() {
        @Override
        public int compare(Tshirt t1, Tshirt t2) {
          int colorTshirt = t1.getColor().compareToIgnoreCase(t2.getColor());
          int sizeTshirt = compareSizes(t1.getSize(),t2.getSize());
          int ownerTshirt = t1.getOwner().compareToIgnoreCase(t2.getOwner());
          if (colorTshirt != 0) return colorTshirt;
          if (sizeTshirt != 0) return sizeTshirt;
          if (ownerTshirt != 0) return ownerTshirt;
          return 0;
        }
      });
      for (Tshirt tshirt : tshirts) {
        out.println(tshirt);
        out.flush();
      }
    }
    in.close();
    out.close();
  }

  private static String read() throws IOException {
      return in.readLine();
  }

  private static int toInt(String s) {
      return Integer.parseInt(s);
  }

  private static int compareSizes(String s1, String s2) {
      if((s1.equalsIgnoreCase("P") && !s2.equalsIgnoreCase("P"))
          || (s1.equalsIgnoreCase("M") && s2.equalsIgnoreCase("G"))
      )
        return -1;
      if((s1.equalsIgnoreCase("M") && s2.equalsIgnoreCase("P"))
          || (s1.equalsIgnoreCase("G") && !s2.equalsIgnoreCase("G"))
      )
        return 1;
      return 0;
  }
}

final class Tshirt {

    private String size;
    private String color;
    private String owner;

    public Tshirt(String size, String color, String owner) {
        this.size = size;
        this.color = color;
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getOwner();
    }
}