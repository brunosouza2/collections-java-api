package br.com.collections.list.catalogo_de_livros;

import br.com.collections.list.catalogo_de_livros.exception.AnoPublicacaoException;

import java.util.Objects;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        setTitulo(titulo);
        setAutor(autor);
        setAnoPublicacao(anoPublicacao);
    }

    public void setTitulo(String titulo) {
        Objects.requireNonNull(titulo);
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        Objects.requireNonNull(autor);
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao <= 0) throw new AnoPublicacaoException("O ano de públicação não pode ser 0 ou negativo.");
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro livro)) return false;
        return anoPublicacao == livro.anoPublicacao && Objects.equals(titulo, livro.titulo) && Objects.equals(autor, livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, anoPublicacao);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
