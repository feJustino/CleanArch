package br.com.zup.Service.UseCase;

import br.com.zup.Domain.exception.ClientInternalSeverError;
import br.com.zup.Domain.model.ClientDomain;
import br.com.zup.Service.gateway.SaveClientGateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class CreateClientUseCase {

    private static final Logger LOGGER = LoggerFactory.getLogger(CreateClientUseCase.class);

    private final SaveClientGateway saveClientGateway;

    @Autowired
    public CreateClientUseCase(SaveClientGateway saveClientGateway) {
        this.saveClientGateway = saveClientGateway;
    }

    @Transactional
    public ClientDomain create(ClientDomain clientDomain) throws ClientInternalSeverError {

        LOGGER.info("Create a Client: {}", clientDomain);

        Optional<ClientDomain> clientDomainReturn = saveClientGateway.saveClient(clientDomain);

        if (clientDomainReturn.isPresent()) {
            return clientDomainReturn.get();
        }
        throw new ClientInternalSeverError("Problem in create Client.");

    }
}
