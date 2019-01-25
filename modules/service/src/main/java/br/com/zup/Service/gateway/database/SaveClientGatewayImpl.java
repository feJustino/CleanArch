package br.com.zup.Service.gateway.database;

import br.com.zup.Domain.model.ClientDomain;
import br.com.zup.Service.gateway.SaveClientGateway;
import br.com.zup.Service.gateway.database.model.ClientEntity;
import br.com.zup.Service.gateway.database.repository.ClientRepository;
import br.com.zup.Service.gateway.database.translate.ClientDomainToClientEntityTranslate;
import br.com.zup.Service.gateway.database.translate.ClientEntityToClientDomainTranslate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SaveClientGatewayImpl implements SaveClientGateway {

    private static final Logger LOGGER = LoggerFactory.getLogger(SaveClientGatewayImpl.class);

    ClientRepository clientRepository;

    @Autowired
    public SaveClientGatewayImpl(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @Override
    public Optional<ClientDomain> saveClient(ClientDomain clientDomain){

        ClientEntity clientEntity = ClientDomainToClientEntityTranslate
                .translate(clientDomain);
        try{
            clientEntity = clientRepository.save(clientEntity);
            LOGGER.debug("Client Saved bih", clientDomain);
        } catch (Exception e){
            LOGGER.error("Error to save", clientDomain);
            Optional.empty();
        }
        return ClientEntityToClientDomainTranslate.translate(clientEntity);
    }
}
