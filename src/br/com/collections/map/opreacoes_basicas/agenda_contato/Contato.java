package br.com.collections.map.opreacoes_basicas.agenda_contato;

import java.util.Objects;

public class Contato {

    private String nome;
    private Integer telefone;

    public Contato(String nome, Integer telefone) {
        setNome(nome);
        setTelefone(telefone);
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public void setTelefone(Integer telefone) {
        Objects.requireNonNull(telefone);
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
