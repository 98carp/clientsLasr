package ec.edu.espe.banquitocore.clients.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.edu.espe.banquitocore.clients.model.Client;
import ec.edu.espe.banquitocore.clients.repository.ClientRepository;

@Service
public class ClientService {
    
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void createCliente(Client client) {
        this.clientRepository.save(client);
    }
    
    public Client obtain(String docummentType, String documment) {
        return this.clientRepository.findFirstByTypeDocummentIdAndDocummentId(docummentType, documment);
    }

    public List<Client> listByApellido(String apellido) {
        return this.clientRepository.findByLastNameLike(apellido);
    }
}
