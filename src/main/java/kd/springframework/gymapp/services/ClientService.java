package kd.springframework.gymapp.services;


import kd.springframework.gymapp.commands.ClientCommand;
import kd.springframework.gymapp.domain.Client;

public interface ClientService extends CrudService<Client, String>{

    public ClientCommand findTrainerAndClientId(String trainerId, String clientId);
}
