package br.com.collections.list.lista_tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private final List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefas.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
    }

    public int obterNumeroTotalDeTarefas() {
        return tarefas.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefas);
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Lavar a louça");
        lista.adicionarTarefa("Cortar o Cabelo");
        lista.adicionarTarefa("Limpar o chão");
        lista.adicionarTarefa("Lavar a louça");

        lista.obterDescricoesTarefas();
        System.out.println("Quantidade Tarefas: " + lista.obterNumeroTotalDeTarefas());
        System.out.println("---------------------------------------------");

        lista.removerTarefa("Lavar a louça");
        lista.obterDescricoesTarefas();
        System.out.println("Quantidade Tarefas: " + lista.obterNumeroTotalDeTarefas());
    }


}
