package kd.springframework.gymapp.services.mongo;


import kd.springframework.gymapp.domain.Client;
import kd.springframework.gymapp.repositories.ClientRepository;
import kd.springframework.gymapp.services.ClientService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientMongoService implements ClientService {

    private final ClientRepository clientRepository;

    public ClientMongoService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> findAll() {
       List<Client> clients = new ArrayList<>();
       clients = clientRepository.findAll();
        return clients;
    }

    @Override
    public Client findById(String s) {
        return clientRepository.findById(s).orElse(null);
    }

    @Override
    public Client save(Client object) {
        return clientRepository.save(object);
    }

    @Override
    public void delete(Client object) {
        clientRepository.delete(object);
    }

    @Override
    public void deleteById(String s) {
        clientRepository.deleteById(s);
    }
}
