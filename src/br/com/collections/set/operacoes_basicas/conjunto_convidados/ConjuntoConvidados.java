package br.com.collections.set.operacoes_basicas.conjunto_convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados(){
        this.convidadosSet = new HashSet<>();
    }

    public Set<Convidado> getConvidadosSet() {
        return convidadosSet;
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(String codigoConvite) {
        int codigo = Integer.parseInt(codigoConvite);
        convidadosSet.removeIf(convidado -> convidado.getCodigoConvite() == codigo);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        convidadosSet.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Bruno", 1);
        conjuntoConvidados.adicionarConvidado("Carlos", 2);
        conjuntoConvidados.adicionarConvidado("Lucas", 3);

        // Não adiciona
        conjuntoConvidados.adicionarConvidado("Bruno", 4);

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite("1");

        System.out.println("------------------------------");
        System.out.println("Depois da remoção: ");

        conjuntoConvidados.exibirConvidados();

    }


}
