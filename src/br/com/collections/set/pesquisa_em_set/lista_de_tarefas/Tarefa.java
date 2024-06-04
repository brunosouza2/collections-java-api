package br.com.collections.set.pesquisa_em_set.lista_de_tarefas;

import java.util.Objects;

public class Tarefa {

    private String descricao;
    private boolean isFinalizada;

    public Tarefa(String descricao) {
        setDescricao(descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        Objects.requireNonNull(descricao);
        this.descricao = descricao;
    }

    public boolean isFinalizada() {
        return isFinalizada;
    }

    public void setFinalizada(boolean finalizada) {
        isFinalizada = finalizada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescricao());
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", isFinalizada=" + isFinalizada +
                '}';
    }
}
