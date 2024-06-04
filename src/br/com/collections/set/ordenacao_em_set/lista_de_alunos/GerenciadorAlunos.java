package br.com.collections.set.ordenacao_em_set.lista_de_alunos;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorAlunos {

    private final Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        alunosSet.removeIf(aluno -> aluno.getMatricula() == matricula);
    }

    public void exibirAlunos() {
        alunosSet.forEach(System.out::println);
    }

    public void exibirAlunosPorNome() {
        alunosSet.stream()
                .sorted(new Aluno.NomeComparator())
                .forEach(System.out::println);
    }

    public void exibirAlunosPorNota() {
        alunosSet.stream()
                .sorted(new Aluno.MediaComparator())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        // Adicionando Alunos
        gerenciador.adicionarAluno("Bruno", 1, 10);
        gerenciador.adicionarAluno("Carlos", 2, 9);
        gerenciador.adicionarAluno("Luiz", 3, 7);
        gerenciador.adicionarAluno("Pedro", 4, 4);

        // Exibindo Alunos
        System.out.println("----------------------");
        System.out.println("Exibindo alunos sem ordem: ");
        gerenciador.exibirAlunos();

        System.out.println("----------------------");
        System.out.println("Removendo o aluno 'Carlos'.");
        gerenciador.removerAluno(2);
        gerenciador.exibirAlunos();

        System.out.println("----------------------");
        System.out.println("Exibindo alunos em ordem alfabética: ");
        gerenciador.exibirAlunosPorNome();

        System.out.println("----------------------");
        System.out.println("Exibindo alunos por ordem de nota (crescente): ");
        gerenciador.exibirAlunosPorNota();


    }
}
