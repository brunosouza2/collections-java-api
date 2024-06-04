package br.com.collections.set.pesquisa_em_set.lista_de_tarefas;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaTarefas {

    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefasSet.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
    }

    public void exibirTarefas() {
        tarefasSet.forEach(System.out::println);
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        return tarefasSet.stream()
                .filter(Tarefa::isFinalizada)
                .collect(Collectors.toUnmodifiableSet());
    }

    public Set<Tarefa> obterTarefasPendente() {
        return tarefasSet.stream()
                .filter(tarefa -> !tarefa.isFinalizada())
                .collect(Collectors.toUnmodifiableSet());
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.getDescricao().equals(descricao)) {
                if (tarefa.isFinalizada()) return;
                tarefa.setFinalizada(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.getDescricao().equals(descricao)) {
                if (!tarefa.isFinalizada()) return;
                tarefa.setFinalizada(false);
                break;
            }
        }
    }

    public void limpaListaTarefas() {
        tarefasSet = new HashSet<>();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando Elementos
        listaTarefas.adicionarTarefa("Lavar louça");
        listaTarefas.marcarTarefaConcluida("Lavar louça");

        listaTarefas.adicionarTarefa("Limpar chão");
        listaTarefas.marcarTarefaConcluida("Limpar chão");

        listaTarefas.adicionarTarefa("Comprar arroz");

        // Exibindo tarefas
        listaTarefas.exibirTarefas();

        // Número Total de Tarefas
        System.out.println("Número de tarefas: " + listaTarefas.contarTarefas());

        System.out.println("Tarefas Concluídas:");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println("Tarefas Pendentes: ");
        System.out.println(listaTarefas.obterTarefasPendente());

        System.out.println("Marcando tarefa 'Limpar chão' como 'pendente'.");
        listaTarefas.marcarTarefaPendente("Limpar chão");
        listaTarefas.exibirTarefas();

        System.out.println("Limpando Tarefas: ");
        listaTarefas.limpaListaTarefas();

        System.out.println("Lista Tarefas Limpa: ");
        listaTarefas.exibirTarefas();

    }



}
