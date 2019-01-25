package br.com.zup.Service.gateway.database.repository;

import br.com.zup.Service.gateway.database.model.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {

}
