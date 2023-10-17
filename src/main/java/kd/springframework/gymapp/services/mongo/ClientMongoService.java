package kd.springframework.gymapp.services.mongo;


import kd.springframework.gymapp.commands.ClientCommand;
import kd.springframework.gymapp.commands.TrainerCommand;
import kd.springframework.gymapp.converters.ClientCommandToClient;
import kd.springframework.gymapp.domain.Client;
import kd.springframework.gymapp.domain.Trainer;
import kd.springframework.gymapp.repositories.ClientCommandRepository;
import kd.springframework.gymapp.repositories.ClientRepository;
import kd.springframework.gymapp.repositories.TrainerCommandRepository;
import kd.springframework.gymapp.services.ClientService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientMongoService implements ClientService {

    private final ClientRepository clientRepository;
    private final TrainerCommandRepository trainerCommandRepository;
    private final ClientCommandToClient clientCommandToClient;
    private final ClientCommandRepository clientCommandRepository;

    public ClientMongoService(ClientRepository clientRepository, TrainerCommandRepository trainerCommandRepository, ClientCommandToClient clientCommandToClient, ClientCommandRepository clientCommandRepository) {
        this.clientRepository = clientRepository;
        this.trainerCommandRepository = trainerCommandRepository;
        this.clientCommandToClient = clientCommandToClient;
        this.clientCommandRepository = clientCommandRepository;
    }

    @Override
    @Transactional
    public List<Client> findAll() {
       List<Client> clients = new ArrayList<>();
       clients = clientCommandRepository.findAll().stream().map(clientCommandToClient::convert)
               .collect(Collectors.toList());

       if(clients == null){
           return null;
       }

        return clients;
    }

    @Override
    public ClientCommand findTrainerAndClientId(String trainerId, String clientId) {
        return null;
    }
/*  @Override
    public ClientCommand findTrainerAndClientId(String trainerId, String clientId) {
        Optional<TrainerCommand> trainerOptional = trainerCommandRepository.findBy(trainerId);

        if(!trainerOptional.isPresent()){
            throw new RuntimeException("Trainer not found by trainer id in clients");
        }


    }*/

    @Override
    public Client findById(String s) {
        Optional<ClientCommand> clientCommandOptional = clientCommandRepository.findById(s);
        return clientCommandOptional.map(clientCommandToClient::convert).orElse(null);
        //return clientRepository.findById(s).orElse(null);
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
