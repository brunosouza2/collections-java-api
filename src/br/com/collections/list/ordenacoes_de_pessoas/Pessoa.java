package br.com.collections.list.ordenacoes_de_pessoas;

import br.com.collections.list.ordenacoes_de_pessoas.exception.AlturaInvalidaException;
import br.com.collections.list.ordenacoes_de_pessoas.exception.IdadeInvalidaException;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) throw new IdadeInvalidaException("A idade não pode ser negativa.");
        this.idade = idade;
    }

    public void setAltura(double altura) {
        if (altura < 0) throw new AlturaInvalidaException("A altura não pode ser negativa.");
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return idade == pessoa.idade && Double.compare(altura, pessoa.altura) == 0 && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, altura);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    @Override
    public int compareTo(Pessoa o) {
        return Integer.compare(getIdade(), o.getIdade());
    }
}
