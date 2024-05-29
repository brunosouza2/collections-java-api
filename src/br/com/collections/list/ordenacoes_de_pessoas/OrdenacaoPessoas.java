package br.com.collections.list.ordenacoes_de_pessoas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorIdade(){
        this.pessoas = pessoas.stream().sorted().toList();
    }

    public void ordenarPorAltura() {
        this.pessoas = pessoas.stream().sorted(new AlturaComparator()).toList();
    }

    public List<Pessoa> obterPessoas () {
        return pessoas;
    }

    static class AlturaComparator implements Comparator<Pessoa> {
        @Override
        public int compare(Pessoa o1, Pessoa o2) {
            return Double.compare(o1.getAltura(), o2.getAltura());
        }
    }

    public static void main(String[] args) {
        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();

        // Adicionando Pessoas
        pessoas.adicionarPessoa("Bruno", 23, 1.75);
        pessoas.adicionarPessoa("Carlos", 31, 1.80);
        pessoas.adicionarPessoa("Lucia", 17, 1.63);
        pessoas.adicionarPessoa("Pedro", 25, 1.78);

        // Ordenando por idade
        //pessoas.ordenarPorIdade();

        // Ordenando por altura
        pessoas.ordenarPorAltura();

        System.out.println(pessoas.obterPessoas());
    }
}
