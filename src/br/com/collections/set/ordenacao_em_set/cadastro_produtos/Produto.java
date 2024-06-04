package br.com.collections.set.ordenacao_em_set.cadastro_produtos;

import br.com.collections.set.ordenacao_em_set.cadastro_produtos.exception.CodigoInvalidoException;
import br.com.collections.set.ordenacao_em_set.cadastro_produtos.exception.PrecoInvalidoException;
import br.com.collections.set.ordenacao_em_set.cadastro_produtos.exception.QuantidadeInvalidaException;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

    private long cod;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long cod, String nome, double preco, int quantidade) {
        setCod(cod);
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public void setCod(long cod) {
        if (cod <= 0) throw new CodigoInvalidoException("O código do produto não pode ser 0 ou negativo");
        this.cod = cod;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco <= 0) throw new PrecoInvalidoException("O preço não pode ser 0 ou negativo.");
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) throw new QuantidadeInvalidaException("A quantidade não pode ser 0 ou negativa.");
        this.quantidade = quantidade;
    }

    public long getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCod() == produto.getCod() && Objects.equals(getNome(), produto.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod(), getNome());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public int compareTo(Produto o) {
        return nome.compareTo(o.getNome());
    }

    static class PrecoComparator implements Comparator<Produto> {

        @Override
        public int compare(Produto o1, Produto o2) {
            return Double.compare(o1.getPreco(), o2.getPreco());
        }
    }
}
