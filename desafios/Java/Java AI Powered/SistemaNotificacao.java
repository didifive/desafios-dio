/*
Java AI Powered
========================================================
Desafios de Código Java Intermediários: S.O.L.I.D
========================================================
2/5 - Sistema de Notificações
========================================================

Descrição
Implemente um sistema de registro de alunos que aplique o Princípio da Responsabilidade Única (SRP) do S.O.L.I.D. Neste contexto, você deve criar duas classes: Student e StudentRegistry. A classe Student será responsável apenas por armazenar informações relacionadas ao aluno (nome e ID), enquanto a classe StudentRegistry terá a única responsabilidade de gerenciar operações de registro, como adicionar e remover alunos.

Entrada
O programa deve receber a entrada do usuário contendo o nome e o ID do aluno, separados por vírgula.

Saída
O programa deve imprimir mensagens de sucesso ou erro, de acordo com as operações realizadas. Se um aluno for adicionado com sucesso, exiba a mensagem no formato: {student.name} added. Se o aluno já estiver registrado, a mensagem deve ser: Student already registered.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

---------------------------------------
| Entrada      |  Saída               |
---------------------------------------
| Carlo, 931   | Carlo adicionado.    |
---------------------------------------
| Mariana, 456 | Mariana adicionado.  |
---------------------------------------
| Joao, 123    | Aluno ja registrado. |
---------------------------------------

SOLUÇÃO ABAIXO: */

import java.util.Scanner;

interface NotificacaoEmail {
    void enviarEmail(String mensagem);
}

interface NotificacaoSMS {
    void enviarSMS(String mensagem);
}

class NotificacaoEmailImpl implements NotificacaoEmail {
    @Override
    public void enviarEmail(String mensagem) {
      Console.mensagem(String.format("Email enviado: %s", mensagem));
    }
}

class NotificacaoSMSImpl implements NotificacaoSMS {
    @Override
    public void enviarSMS(String mensagem) {
      Console.mensagem(String.format("SMS enviado: %s", mensagem));
    }
}

class Console {
    public static void mensagem(String mensagem) {
        System.out.println(mensagem);
    }
}

public class SistemaNotificacao {
  public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)) {
      String[] entradas = scanner.nextLine().split(", ");
  
      String tipoNotificacao = entradas[0];
      String mensagem = entradas[1];
  
      switch (tipoNotificacao) {
          case "email":
              NotificacaoEmail email = new NotificacaoEmailImpl();
              email.enviarEmail(mensagem);
              break;
          case "sms":
              NotificacaoSMS sms = new NotificacaoSMSImpl();
              sms.enviarSMS(mensagem);
              break;
          default:
              Console.mensagem("Tipo de notificacao invalido.");
      }
    }
  }
}