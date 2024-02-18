/*
Java AI Powered
========================================================
Desafios de Código Java Intermediários: S.O.L.I.D
========================================================
1/5 - Registro de Alunos
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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// A classe Aluno representa as informações do aluno
class Aluno {
    private String nome;
    private String id;

    // Construtor da classe Aluno
    public Aluno(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    // Getters para obter informações do aluno
    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }
}

// A classe RegistroAluno gerencia as operações de registro de alunos
class RegistroAluno {
    private List<Aluno> alunosRegistrados;

    // Construtor da classe RegistroAluno
    public RegistroAluno() {
        this.alunosRegistrados = new ArrayList<>();
        // Adiciona João, 123 na lista inicialmente
        this.alunosRegistrados.add(new Aluno("João", "123"));
    }

    // Lógica para adicionar aluno à lista apenas se o ID não estiver duplicado
    public void adicionaAluno(Aluno aluno) {
        if (alunoJaRegistrado(aluno)) {
            MensagemHandler.exibirMensagem("Aluno ja registrado.");
        } else {
            this.alunosRegistrados.add(aluno);
            MensagemHandler.exibirMensagem(String.format("%s adicionado.", aluno.getNome()));
        }
    }
    
    // Método para verificar se um aluno já está registrado
    private boolean alunoJaRegistrado(Aluno aluno) {
        return alunosRegistrados.stream().anyMatch(a -> a.getId().equals(aluno.getId()));
    }
}

// A classe MensagemHandler é responsável por exibir mensagens
class MensagemHandler {
    public static void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}

public class SistemaRegistroAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando uma instância da classe RegistroAluno
        RegistroAluno registroAluno = new RegistroAluno();

        // Entrada do usuário
        String input = scanner.nextLine();
        
        // Fechando o scanner
        scanner.close();

        // Separando nome e ID
        String[] dadosAluno = input.split(", ");

        // Criando uma instância da classe Aluno com as informações fornecidas pelo usuário
        Aluno aluno = new Aluno(dadosAluno[0], dadosAluno[1]);

        //Chama o método para adicionar o aluno usando a classe RegistroAluno
        registroAluno.adicionaAluno(aluno);
    }
}