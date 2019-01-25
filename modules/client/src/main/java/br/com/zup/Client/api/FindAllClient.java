package br.com.zup.Client.api;

import br.com.zup.Client.api.model.FindAllClientsResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface FindAllClient {

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    ResponseEntity<FindAllClientsResponse> find() throws Exception;

}
