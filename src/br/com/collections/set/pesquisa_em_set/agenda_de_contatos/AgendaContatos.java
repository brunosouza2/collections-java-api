package br.com.collections.set.pesquisa_em_set.agenda_de_contatos;

import br.com.collections.set.pesquisa_em_set.agenda_de_contatos.exception.ContatoNaoEncontradoException;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private final Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroDeTelefone) {
        contatosSet.add(new Contato(nome, numeroDeTelefone));
    }

    public void exibirContatos() {
        contatosSet.forEach(System.out::println);
    }

    public Contato pesquisarPorNome(String nome) {
        return contatosSet.stream()
                .filter(contato -> contato.getNome().equals(nome))
                .findFirst()
                .orElseThrow(() -> new ContatoNaoEncontradoException("Contato não encontrado."));
    }

    public void atualizaNumeroContato(String nome, int novoNumero) {
        for (Contato contato : contatosSet) {
            if (contato.getNome().equals(nome)) {
                contato.setNumeroDeTelefone(novoNumero);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        // Adicionando Contatos
        agenda.adicionarContato("Bruno", 123);
        agenda.adicionarContato("Lucas", 223);
        agenda.adicionarContato("Pedro", 998);

        //agenda.adicionarContato("Joao", 123);

        agenda.exibirContatos();
        System.out.println("-----------------");
        System.out.println("Pesquisa por nome: 'Bruno' -> " + agenda.pesquisarPorNome("Bruno"));
        agenda.atualizaNumeroContato("Bruno", 999);
        System.out.println("Atualizando número do contato 'Bruno' -> " + agenda.pesquisarPorNome("Bruno"));

    }
}
