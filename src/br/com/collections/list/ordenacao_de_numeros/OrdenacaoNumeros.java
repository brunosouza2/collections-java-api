package br.com.collections.list.ordenacao_de_numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer> {

    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public void ordenarAscendente() {
       Collections.sort(numeros);
    }

    public void ordenarDescendente() {
        Collections.reverse(numeros);
    }

    public List<Integer> obterNumeros() {
        return numeros;
    }


    @Override
    public int compareTo(Integer o) {
        return Integer.compare(o, 0);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(12);
        ordenacaoNumeros.adicionarNumero(44);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(2);

        System.out.println(ordenacaoNumeros.obterNumeros());
        ordenacaoNumeros.ordenarAscendente();

        System.out.println("--------------");
        System.out.println("Ordem Ascendente");
        System.out.println(ordenacaoNumeros.obterNumeros());

        ordenacaoNumeros.ordenarDescendente();
        System.out.println("--------------");
        System.out.println("Ordem Decrescente");
        System.out.println(ordenacaoNumeros.obterNumeros());
    }
}
