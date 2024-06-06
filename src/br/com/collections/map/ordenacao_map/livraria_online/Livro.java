package br.com.collections.map.ordenacao_map.livraria_online;

import br.com.collections.map.ordenacao_map.livraria_online.exception.PrecoInvalidoException;

import java.util.Comparator;
import java.util.Objects;

public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        setTitulo(titulo);
        setAutor(autor);
        setPreco(preco);
    }

    public void setTitulo(String titulo) {
        Objects.requireNonNull(titulo);
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        Objects.requireNonNull(autor);
        this.autor = autor;
    }

    public void setPreco(double preco) {
        if (preco <= 0) throw new PrecoInvalidoException("O preço não pode ser 0 ou negativo");
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro livro)) return false;
        return Objects.equals(getTitulo(), livro.getTitulo()) && Objects.equals(getAutor(), livro.getAutor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getAutor());
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }

    static class PrecoComparator implements Comparator<Livro> {

        @Override
        public int compare(Livro o1, Livro o2) {
            return Double.compare(o1.getPreco(), o2.getPreco());
        }

    }
}
