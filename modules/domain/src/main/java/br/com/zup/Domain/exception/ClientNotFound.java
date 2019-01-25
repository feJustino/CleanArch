package br.com.zup.Domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ClientNotFound extends ViolationException{

    private static final long serialVersionUID = 5693992065208208568L;

    public ClientNotFound (String message) {
        super(message);
    }
}
