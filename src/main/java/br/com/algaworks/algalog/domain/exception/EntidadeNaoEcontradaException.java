package br.com.algaworks.algalog.domain.exception;

public class EntidadeNaoEcontradaException extends NegocioException {

    private static final long serialVersionUID = 1L;

    public EntidadeNaoEcontradaException(String message) {
        super(message);
    }
}
