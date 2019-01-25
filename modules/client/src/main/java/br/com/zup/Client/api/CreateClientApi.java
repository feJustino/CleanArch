package br.com.zup.Client.api;

import br.com.zup.Client.api.model.CreateClientRequest;
import br.com.zup.Client.api.model.CreateClientResponse;
import br.com.zup.Domain.exception.ClientBadRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface CreateClientApi {

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<CreateClientResponse> create(@RequestBody CreateClientRequest createClient)throws ClientBadRequest;

}
