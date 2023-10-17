package kd.springframework.gymapp.controllers;

import kd.springframework.gymapp.commands.ClientCommand;
import kd.springframework.gymapp.converters.ClientCommandToClient;
import kd.springframework.gymapp.domain.Client;
import kd.springframework.gymapp.services.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class ClientController {
    private final ClientService clientService;


    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients")
    public List<Client> getClients(){

        List<Client> clients = new ArrayList<>();
        clients = clientService.findAll();
        return clients;
    }

    @GetMapping("/client/{idClient}/show")
    public Client getClient(@PathVariable String idClient){
        Client client = clientService.findById(idClient);
       // client = clientCommand
        if(client != null) {
            return client;
        }

        return null;
    }
}
