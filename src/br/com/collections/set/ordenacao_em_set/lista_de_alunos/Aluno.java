package br.com.collections.set.ordenacao_em_set.lista_de_alunos;

import br.com.collections.set.ordenacao_em_set.lista_de_alunos.exception.MediaInvalidaException;
import br.com.collections.set.ordenacao_em_set.lista_de_alunos.exception.NumeroDeMatriculaInvalidaException;

import java.util.Comparator;
import java.util.Objects;

public class Aluno {

    private String nome;
    private long matricula;
    private double media;

    public Aluno(String nome, long matricula, double media) {
        setNome(nome);
        setMatricula(matricula);
        setMedia(media);
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public void setMatricula(long matricula) {
        if (matricula <= 0) throw new NumeroDeMatriculaInvalidaException("Matricula não pode ser 0 ou negativa.");
        this.matricula = matricula;
    }

    public void setMedia(double media) {
        if (media < 0) throw new MediaInvalidaException("Média não pode ser negativa.");
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }

    static class NomeComparator implements Comparator<Aluno> {

        @Override
        public int compare(Aluno o1, Aluno o2) {
            return o1.getNome().compareTo(o2.getNome());
        }

    }

    static class MediaComparator implements Comparator<Aluno> {

        @Override
        public int compare(Aluno o1, Aluno o2) {
            return Double.compare(o1.getMedia(), o2.getMedia());
        }

    }
}
