package br.com.collections.set.operacoes_basicas.conjunto_convidados;

import br.com.collections.set.operacoes_basicas.conjunto_convidados.exception.CodigoDeConviteInvalidoException;

import java.util.Objects;

public class Convidado {

    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        setNome(nome);
        setCodigoConvite(codigoConvite);
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public void setCodigoConvite(int codigoConvite) {
        if (codigoConvite < 0) throw new CodigoDeConviteInvalidoException("O código de convite não pode ser negativo.");
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
