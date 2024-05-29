package br.com.collections.list.soma_de_numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private final List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        return numeros.stream().reduce(0, Integer::sum);
    }

    public int encontrarMaiorNumero(){
        return numeros.stream().max(Integer::compare).orElseThrow();
    }

    public int encontraMenorValor() {
        return numeros.stream().min(Integer::compare).orElseThrow();
    }

    public List<Integer> exibirNumeros() {
        return numeros;
    }
    
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(23);

        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());
        System.out.println("Encontra maior valor: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Encontra menor valor: " + somaNumeros.encontraMenorValor());
        System.out.println("Números: " + somaNumeros.exibirNumeros());

    }
}
