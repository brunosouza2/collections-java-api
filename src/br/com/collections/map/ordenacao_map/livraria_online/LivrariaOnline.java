package br.com.collections.map.ordenacao_map.livraria_online;

import br.com.collections.map.ordenacao_map.livraria_online.exception.LivroNaoEncontradoException;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {

    private final Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new TreeMap<>();
    }

    public void adicionarLivro(String isbn, String titulo, String autor, double preco) {
        livrosMap.put(isbn, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        livrosMap.entrySet().removeIf(entry -> entry.getValue().getTitulo().equals(titulo));
    }

    public void exibirLivrosOrdenadosPorPreco() {
        livrosMap.values().stream()
                .sorted(new Livro.PrecoComparator())
                .forEach(System.out::println);
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        return livrosMap.values().stream()
                .filter(livro -> livro.getAutor().equalsIgnoreCase(autor))
                .toList();
    }

    public Livro obterLivroMaisCaro() {
        return livrosMap.values().stream()
                .max(new Livro.PrecoComparator())
                .orElseThrow(LivroNaoEncontradoException::new);
    }

    public Livro obterLivroMaisBarato() {
        return livrosMap.values().stream()
                .min(new Livro.PrecoComparator())
                .orElseThrow(LivroNaoEncontradoException::new);
    }

    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("6598078806",
                "Café com Deus Pai 2024: Porções Diárias de paz",
                "Júnior Rostirola",
                49.90);
        livraria.adicionarLivro("8550807567",
                "Hábitos Atômicos: um Método Fácil e Comprovado de Criar Bons Hábitos e se Livrar dos Maus",
                "James Clear",
                46.90);
        livraria.adicionarLivro("8568014054",
                "Atitude mental positiva",
                "Napoleon Hill",
                21.99);
        livraria.adicionarLivro("8546501459",
                "O poder do subconsciente",
                "Joseph Murphy",
                39.90);
        livraria.adicionarLivro("6555844140",
                "Encontrei um pai: Reconheça Quem Você é, e Viva o seu Propósito",
                "Júnior Rostirola",
                41.40);

        System.out.println("--------------------------------");
        livraria.exibirLivrosOrdenadosPorPreco();

        System.out.println("--------------------------------");
        System.out.println("Pesquisando Livros do autor: 'Júnior Rostirola': ");
        System.out.println(livraria.pesquisarLivrosPorAutor("Júnior Rostirola"));

        System.out.println("--------------------------------");
        System.out.println("Livro mais caro: " + livraria.obterLivroMaisCaro());

        System.out.println("--------------------------------");
        System.out.println("Livro mais barato: " + livraria.obterLivroMaisBarato());

        System.out.println("--------------------------------");
        System.out.println("Removendo livro: 'Atitude mental positiva'");
        livraria.removerLivro("Atitude mental positiva");
        livraria.exibirLivrosOrdenadosPorPreco();






    }






}
