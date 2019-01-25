package br.com.zup.Service.gateway.database.translate;

import br.com.zup.Domain.model.ClientDomain;
import br.com.zup.Service.gateway.database.model.ClientEntity;


public class ClientDomainToClientEntityTranslate {
    public static ClientEntity translate(ClientDomain clientDomain){
        return ClientEntity.builder()
                .name(clientDomain.getName())
                .age(clientDomain.getAge())
                .bankAccount(clientDomain.getBankAccount()).build();

    }

}