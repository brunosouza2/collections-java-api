package br.com.collections.set.pesquisa_em_set.agenda_de_contatos;

import br.com.collections.set.pesquisa_em_set.agenda_de_contatos.exception.NumeroDeTelefoneInvalidoException;

import java.util.Objects;

public class Contato {

    private String nome;
    private int numeroDeTelefone;

    public Contato(String nome, int numeroDeTelefone) {
        setNome(nome);
        setNumeroDeTelefone(numeroDeTelefone);
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public void setNumeroDeTelefone(int numeroDeTelefone) {
        if (numeroDeTelefone < 0) throw new NumeroDeTelefoneInvalidoException("Número de telefone não pode ser negativo.");
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return getNumeroDeTelefone() == contato.getNumeroDeTelefone();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNumeroDeTelefone());
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numeroDeTelefone=" + numeroDeTelefone +
                '}';
    }
}
