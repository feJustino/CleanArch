package br.com.zup.Service.controller.translator;

import br.com.zup.Client.api.model.CreateClientRequest;
import br.com.zup.Domain.exception.ClientBadRequest;
import br.com.zup.Domain.model.ClientDomain;

import java.math.BigDecimal;

public class CreateClientRequestToClientDomainTranslator {
    public static ClientDomain translate(CreateClientRequest createClientRequest) throws ClientBadRequest {
        return ClientDomain.builder(createClientRequest.getName(),createClientRequest.getAge(), createClientRequest.getBankAccount())
                .build();
    }
}
