package br.com.collections.set.ordenacao_em_set.cadastro_produtos;

import java.util.HashSet;
import java.util.Set;

public class CadastroProdutos {

    private final Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProdutos(long cod, String nome, double preco, int quantidade) {
        produtosSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public void exibirProdutos() {
        produtosSet.forEach(System.out::println);
    }

    public void exibirProdutosPorNome() {
        produtosSet.stream()
                .sorted()
                .forEach(System.out::println);
    }

    public void exibirProdutosPorPreco() {
        produtosSet.stream()
                .sorted(new Produto.PrecoComparator())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando Produtos
        cadastroProdutos.adicionarProdutos(1, "Coca-cola", 5.0, 10);
        cadastroProdutos.adicionarProdutos(2, "Guaraná", 4.0, 5);
        cadastroProdutos.adicionarProdutos(3, "Pepsi", 4.5, 20);
        cadastroProdutos.adicionarProdutos(4, "Itubaína", 3.5, 15);

        // Exibindo produtos
        System.out.println("--------------------------");
        System.out.println("Sem ordem: ");
        cadastroProdutos.exibirProdutos();

        // Exibindo produtos ordenados alfabéticamente
        System.out.println("--------------------------");
        System.out.println("Ordem por nome: ");
        cadastroProdutos.exibirProdutosPorNome();

        // Exibindo produtos ordenados por preço
        System.out.println("--------------------------");
        System.out.println("Ordem por preço: ");
        cadastroProdutos.exibirProdutosPorPreco();


    }

}
