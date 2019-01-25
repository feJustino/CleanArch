package br.com.zup.Domain.exception;

public abstract class ViolationException extends Exception {

    private static final long serialVersionUID = 4392668012173281740L;

    public ViolationException(String message) {super(message);}

}
