package br.com.collections.map.pesquisa.estoque_de_produtos_com_preco;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalDouble;

public class EstoqueProdutos {

    private final Map<Long, Produto> produtosMap;

    public EstoqueProdutos() {
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
        produtosMap.put(cod, new Produto(cod, nome, quantidade, preco));
    }

    public void exibirProdutos() {
        produtosMap.forEach((key, product) -> System.out.printf("%d = Produto{código: %d, nome: %s, quantidade: %d, preço: %.1f" +
                "}%n", key, product.getCodigo(), product.getNome(), product.getQuantidade(), product.getPreco()));
    }

    public double calculaValorTotalEstoque() {
        return produtosMap.values()
                .stream()
                .reduce(0.0,
                        (subtotal, produto) -> subtotal + (produto.getQuantidade() * produto.getPreco()), Double::sum);
    }

    public Produto obterProdutoMaisCaro() {
        return produtosMap.values().stream()
                .max(Comparator.comparingDouble(Produto::getPreco))
                .orElseThrow();
    }

    public Produto obterProdutoMaisBarato() {
        return produtosMap.values().stream()
                .min(Comparator.comparingDouble(Produto::getPreco))
                .orElseThrow();
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        return produtosMap.values().stream()
                .max(Comparator.comparingDouble(p -> p.getQuantidade() * p.getPreco()))
                .orElseThrow();
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L, "Coca-cola", 10, 5.5);
        estoque.adicionarProduto(2L, "Guaraná", 5, 4.9);
        estoque.adicionarProduto(2L, "Água mineral", 100, 2);

        estoque.exibirProdutos();

        System.out.println("Soma total do estoque: " + estoque.calculaValorTotalEstoque());
        System.out.println("Produto mais caro do estoque: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato do estoque: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto maior quantidade considerando preço e estoque: " +
                estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }


}
