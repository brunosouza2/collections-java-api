package br.com.collections.map.opreacoes_basicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private final Map<String, String> definicoesMap;

    public Dicionario() {
        this.definicoesMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        definicoesMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        definicoesMap.remove(palavra);
    }

    public void exibirPalavras() {
        definicoesMap.forEach((key, value) -> System.out.printf("{key: %s, value: %s}%n", key, value));
    }

    public String pesquisarPorPalavra(String palavra) {
        return definicoesMap.get(palavra);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Amor",
                "forte afeição por outra pessoa," +
                        " nascida de laços de consanguinidade ou de relações sociais.");
        dicionario.adicionarPalavra("Paz",
                "relação entre pessoas que não estão em conflito; acordo, concórdia.");
        dicionario.adicionarPalavra("Luz",
                "a iluminação que procede do Sol durante o dia; luz do dia; claridade.");

        System.out.println("-------------------------------");
        dicionario.exibirPalavras();

        System.out.println("-------------------------------");
        System.out.println("Excluindo palavra: 'Amor' ");
        dicionario.removerPalavra("Amor");

        System.out.println("-------------------------------");
        dicionario.exibirPalavras();

        System.out.println("-------------------------------");
        System.out.println("Pesquisando o significado da palavra: 'Paz', Significado: " + dicionario.pesquisarPorPalavra("Paz"));
    }




}
