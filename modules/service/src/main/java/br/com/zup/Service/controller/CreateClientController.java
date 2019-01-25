package br.com.zup.Service.controller;

import br.com.zup.Client.api.CreateClientApi;
import br.com.zup.Client.api.model.CreateClientRequest;
import br.com.zup.Client.api.model.CreateClientResponse;
import br.com.zup.Domain.exception.ViolationException;
import br.com.zup.Domain.model.ClientDomain;
import br.com.zup.Service.UseCase.CreateClientUseCase;
import br.com.zup.Service.controller.translator.ClientDomainToCreateClientRequestTranslator;
import br.com.zup.Service.controller.translator.CreateClientRequestToClientDomainTranslator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateClientController implements CreateClientApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(CreateClientController.class);


    private final CreateClientUseCase createClientUseCase;

    @Autowired
    public CreateClientController(CreateClientUseCase createClientUseCase) {
        this.createClientUseCase = createClientUseCase;
    }

    @Override
    public ResponseEntity<CreateClientResponse> create(@RequestBody CreateClientRequest createClientRequest) throws ViolationException {
        ResponseEntity<CreateClientResponse> response;

        LOGGER.debug("Create Payment Plan initialized");

        ClientDomain ClientDomain = CreateClientRequestToClientDomainTranslator.translate(createClientRequest);

        ClientDomain = createClientUseCase.create(ClientDomain);

        CreateClientResponse createClientResponse = ClientDomainToCreateClientRequestTranslator.translate(ClientDomain);

        response = new ResponseEntity<>(createClientResponse, HttpStatus.OK);


        return response;
    }
}
