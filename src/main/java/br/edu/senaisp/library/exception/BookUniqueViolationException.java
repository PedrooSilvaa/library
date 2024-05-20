package br.edu.senaisp.library.exception;

public class BookUniqueViolationException extends RuntimeException{

    public BookUniqueViolationException(String message) {
        super(message);
    }
}
