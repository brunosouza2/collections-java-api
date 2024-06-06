package br.com.collections.map.ordenacao_map.agenda_de_eventos;

import java.util.Objects;

public class Evento {

    private String nome;
    private String atracao;

    public Evento(String nome, String atracao) {
        setNome(nome);
        setAtracao(atracao);
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public void setAtracao(String atracao) {
        Objects.requireNonNull(atracao);
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evento evento)) return false;
        return Objects.equals(getNome(), evento.getNome()) && Objects.equals(getAtracao(), evento.getAtracao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getAtracao());
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
