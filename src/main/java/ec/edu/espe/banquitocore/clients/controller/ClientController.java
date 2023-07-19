package ec.edu.espe.banquitocore.clients.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.banquitocore.clients.model.Client;
import ec.edu.espe.banquitocore.clients.service.ClientService;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {
    
    private final ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @PostMapping 
    public ResponseEntity createClient(@RequestBody Client client) {
        this.service.createCliente(client);
        return ResponseEntity.ok().build();
    } 

    @GetMapping
    public ResponseEntity<List<Client>> listByLastName(@PathParam("lastName") String lastname) {
        List<Client> clients = this.service.listByApellido(lastname);
        return ResponseEntity.ok(clients);
    }

    @GetMapping("/{type}/{documment}")
    public ResponseEntity<Client> findByPK(@PathVariable("type") String type, @PathVariable("documment") String documment) {
        return ResponseEntity.ok(this.service.obtain(type, documment));
    }

}
