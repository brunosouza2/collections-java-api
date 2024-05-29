package br.com.collections.list.catalogo_de_livros;

import br.com.collections.list.catalogo_de_livros.exception.LivroNaoEncontradoException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CatalogoLivros {

    private final List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        if (livros.isEmpty()) return new ArrayList<>();
        return livros.stream()
                .filter(livro -> livro.getAutor().equals(autor))
                .toList();
    }
    
    public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal) {
         if (livros.isEmpty()) return new ArrayList<>();
         Predicate<Livro> isInRange = livro -> (livro.getAnoPublicacao() >= anoInicial) && (livro.getAnoPublicacao() <= anoFinal);
         return livros.stream()
               .filter(isInRange)
               .toList();
    }

    public Livro pesquisaPorTitulo(String titulo) {
        return livros.stream()
                .filter(livro -> livro.getTitulo().equals(titulo))
                .findFirst()
                .orElseThrow(() -> new LivroNaoEncontradoException("Livro não encontrado."));
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        // Adicionando 4 livros diferentes
        catalogo.adicionarLivro("Livro 1", "Bruno", 2021);
        catalogo.adicionarLivro("Livro 9", "Bruno", 2021);
        catalogo.adicionarLivro("Livro 2", "Ana", 2022);
        catalogo.adicionarLivro("Livro 3", "Carlos", 2020);
        catalogo.adicionarLivro("Livro 4", "Diana", 2019);

        // Adicionando 2 livros iguais
        catalogo.adicionarLivro("Livro 5", "Eduardo", 1990);
        catalogo.adicionarLivro("Livro 5", "Eduardo", 2023);
        catalogo.adicionarLivro("Livro 5", "Julio", 2023);

        System.out.println("Pesquisa por autor: ");
        System.out.println(catalogo.pesquisarPorAutor("Bruno"));

        System.out.println("Pesquisa por intervalo de anos: ");
        System.out.println(catalogo.pesquisarPorIntervaloDeAnos(2020, 2021));

        System.out.println("Pesquisa por titulo: ");
        System.out.println(catalogo.pesquisaPorTitulo("Livro 5"));
    }

    







}
