package kd.springframework.gymapp;

import kd.springframework.gymapp.commands.ClientCommand;
import kd.springframework.gymapp.commands.TrainerCommand;
import kd.springframework.gymapp.converters.ClientCommandToClient;
import kd.springframework.gymapp.converters.TrainerCommandToTrainer;
import kd.springframework.gymapp.domain.Client;
import kd.springframework.gymapp.domain.Trainer;
import org.springframework.stereotype.Service;

@Service
public class ConversionService {
    private final ClientCommandToClient clientConverter;
    private final TrainerCommandToTrainer trainerConverter;

    public ConversionService(ClientCommandToClient clientConverter, TrainerCommandToTrainer trainerConverter) {
        this.clientConverter = clientConverter;
        this.trainerConverter = trainerConverter;
    }

    public Client convertToClient(ClientCommand clientCommand) {
        return clientConverter.convert(clientCommand);
    }

    public Trainer convertToTrainer(TrainerCommand trainerCommand) {
        return trainerConverter.convert(trainerCommand);
    }
}