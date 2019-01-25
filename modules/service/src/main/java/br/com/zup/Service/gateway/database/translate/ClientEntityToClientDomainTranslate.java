package br.com.zup.Service.gateway.database.translate;

import br.com.zup.Domain.model.ClientDomain;
import br.com.zup.Service.gateway.database.model.ClientEntity;

import java.util.Optional;

public class ClientEntityToClientDomainTranslate {
    public static Optional<ClientDomain> translate(ClientEntity clientEntity) {
        try {
            return Optional.ofNullable(ClientDomain.builder(clientEntity.getName(), clientEntity.getAge(), clientEntity.getBankAccount())
                    .id(clientEntity.getId())
                    .build());
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
