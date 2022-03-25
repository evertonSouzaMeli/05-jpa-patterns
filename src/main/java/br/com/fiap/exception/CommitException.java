package br.com.fiap.exception;

public class CommitException extends Exception {

    public CommitException() {
    }

    public CommitException(String message) {
        super(message);
    }

    public CommitException(String message, Throwable cause) {
        super(message, cause);
    }
}
