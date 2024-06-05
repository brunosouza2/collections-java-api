package br.com.collections.map.pesquisa.contagem_palavras;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ContagemPalavas {

    private final Map<String, Integer> contagemMap;

    public ContagemPalavas() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        contagemMap.remove(palavra);
    }

    public void exibirContagemDePalavras() {
        contagemMap.forEach((key, value) -> System.out.printf("key: %s -> Contagem: %d%n", key, value));
    }

    public String encontrarPalavraMaisFrequente() {
        return contagemMap.entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElseThrow();
    }

    public static void main(String[] args) {
        ContagemPalavas contagem = new ContagemPalavas();

        contagem.adicionarPalavra("Olá", 50);
        contagem.adicionarPalavra("Twitter", 150);
        contagem.adicionarPalavra("tropa", 12);

        contagem.exibirContagemDePalavras();

        System.out.println();

        contagem.removerPalavra("tropa");

        System.out.println();

        contagem.exibirContagemDePalavras();

        System.out.println("Palavra Mais Frequente: " + contagem.encontrarPalavraMaisFrequente());
    }


}
