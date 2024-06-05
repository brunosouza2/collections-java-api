package br.com.collections.map.pesquisa.estoque_de_produtos_com_preco;

import br.com.collections.map.pesquisa.estoque_de_produtos_com_preco.exception.CodigoInvalidoException;
import br.com.collections.map.pesquisa.estoque_de_produtos_com_preco.exception.PrecoInvalidoException;
import br.com.collections.map.pesquisa.estoque_de_produtos_com_preco.exception.QuantidadeInvalidaException;

import java.util.Objects;

public class Produto {

    private Long codigo;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(Long codigo, String nome, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void setCodigo(Long codigo) {
        if (codigo <= 0) throw new CodigoInvalidoException("O código não pode ser 0 ou negativo");
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) throw new QuantidadeInvalidaException("Quantidade não pode ser negativa");
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        if (preco < 0) throw new PrecoInvalidoException("O preço do produto não pode ser negativo.");
        this.preco = preco;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return Objects.equals(getCodigo(), produto.getCodigo());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigo());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "preco=" + preco +
                ", quantidade=" + quantidade +
                ", nome='" + nome + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
