package br.com.zup.Domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ClientInternalSeverError extends ViolationException{

    private static final long serialVersionUID = 5807206996342508044L;

    public ClientInternalSeverError(String message) {
        super(message);
    }
}
