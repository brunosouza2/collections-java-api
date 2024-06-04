package br.com.collections.set.operacoes_basicas.conjunto_palavras_unicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private final Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavrasSet.removeIf(p -> p.equals(palavra));
    }

    public boolean verificarPalavra(String palavra) {
        for (String string : palavrasSet) {
            if (string.equals(palavra)) {
                return true;
            }
        }
        return false;
    }

    public void exibirPalavrasUnicas() {
        palavrasSet.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        palavras.adicionarPalavra("Bruno");
        palavras.adicionarPalavra("Carlos");
        palavras.adicionarPalavra("Lucio");
        //palavras.adicionarPalavra("Bruno");

        palavras.exibirPalavrasUnicas();

        System.out.println("-----------------");

        palavras.removerPalavra("Carlos");
        System.out.println("Depois da remoção: ");
        palavras.exibirPalavrasUnicas();

        System.out.println();
        System.out.println("A palavra 'Bruno' está presente? " + palavras.verificarPalavra("Bruno"));
    }


}
