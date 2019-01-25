package br.com.zup.Service.controller.translator;

import br.com.zup.Client.api.model.CreateClientResponse;
import br.com.zup.Domain.model.ClientDomain;

public class ClientDomainToCreateClientRequestTranslator {
    public static CreateClientResponse translate(ClientDomain clientDomain) {
        return CreateClientResponse.builder()
                .id(clientDomain.getId())
                .build();
    }
}