package br.com.collections.map.opreacoes_basicas.agenda_contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {

    private final Map<String, Integer> contatosMap;

    public AgendaContato() {
        this.contatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        contatosMap.remove(nome);
    }

    public void exibirContatos() {
        contatosMap.forEach((key, value) -> System.out.printf("{Key: %s, Value: %d}%n", key, value));
    }

    public Integer pesquisarPorNome(String nome) {
        return contatosMap.get(nome);
    }

    public static void main(String[] args) {
        AgendaContato agenda = new AgendaContato();

        // Adicionando elementos
        agenda.adicionarContato("Bruno", 1190922299);
        agenda.adicionarContato("Lucio", 1190922224);
        agenda.adicionarContato("Julio", 1190922233);
        agenda.adicionarContato("Pedro", 1190922249);

        // Exibindo
        agenda.exibirContatos();

        // Removendo contato
        System.out.println("Removendo contato: 'Lucio'");
        agenda.removerContato("Lucio");

        // Exibindo
        System.out.println("----------------");
        agenda.exibirContatos();

        // Telefone
        System.out.println("----------------");
        System.out.println("Número de Telefone do Contato: 'Bruno' " + agenda.pesquisarPorNome("Bruno"));

        System.out.println("----------------");
        agenda.exibirContatos();


    }
}
