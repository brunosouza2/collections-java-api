package br.com.collections.map.ordenacao_map.livraria_online.exception;

public class LivroNaoEncontradoException extends RuntimeException {

    public LivroNaoEncontradoException() {
    }

    public LivroNaoEncontradoException(String message) {
        super(message);
    }
}
