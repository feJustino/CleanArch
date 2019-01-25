package br.com.zup.Service.gateway;

import br.com.zup.Domain.model.ClientDomain;

import java.util.Optional;

public interface SaveClientGateway {

    Optional<ClientDomain> saveClient(ClientDomain clientDomain);

}
