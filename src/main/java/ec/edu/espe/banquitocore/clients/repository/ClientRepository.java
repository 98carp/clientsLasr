package ec.edu.espe.banquitocore.clients.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.espe.banquitocore.clients.model.Client;

public interface ClientRepository extends MongoRepository<Client, String> {
    
    Client findFirstByTypeDocummentIdAndDocummentId(String typeDocumment, String docummentId);

    List<Client> findByLastNameLike(String apellido);
}
