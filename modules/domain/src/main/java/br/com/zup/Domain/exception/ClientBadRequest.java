package br.com.zup.Domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ClientBadRequest extends ViolationException{

    private static final long serialVersionUID = -2317430146755794841L;

    public ClientBadRequest(String message) {
        super(message);
    }
}
