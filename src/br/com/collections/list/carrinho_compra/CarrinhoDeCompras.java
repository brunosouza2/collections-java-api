package br.com.collections.list.carrinho_compra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {

    private final List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        itens.removeIf(item -> item.getNome().equals(nome));
    }

    public void exibirItens() {
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        System.out.println("--------------------------------");

        carrinho.adicionarItem("Coca-cola", 12.50, 2); // ok
        carrinho.adicionarItem("Guaraná", 10.50, 5);
        carrinho.adicionarItem("Leite UHT Integral", 5.0, 9);
        carrinho.adicionarItem("Coca-cola", 12.50, 10);

        carrinho.exibirItens(); // ok

        System.out.println("--------------------------------");

        carrinho.removerItem("Coca-cola");
        carrinho.exibirItens();
    }


}
