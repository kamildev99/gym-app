package kd.springframework.gymapp.converters;

import kd.springframework.gymapp.commands.ClientCommand;
import kd.springframework.gymapp.domain.Client;
import kd.springframework.gymapp.services.TrainerService;
import lombok.Synchronized;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class ClientCommandToClient implements Converter<ClientCommand, Client> {

    @Lazy
    private final TrainerCommandToTrainer trainerCommandToTrainer;
    private final TrainerService trainerService;

    public ClientCommandToClient(TrainerCommandToTrainer trainerCommandToTrainer, TrainerService trainerService) {
        this.trainerCommandToTrainer = trainerCommandToTrainer;
        this.trainerService = trainerService;
    }

    @Nullable
    @Synchronized
    @Override
    public Client convert(ClientCommand source) {
        if(source == null){
            return null;
        }


        Client client = new Client();
        client.setId(source.getId());
        client.setFirstName(source.getFirstName());
        client.setLastName(source.getLastName());
        client.setBirthDate(LocalDate.parse(source.getBirthDate(),DateTimeFormatter.ofPattern("dd-MM-yyyy")));
       // client.setTrainers(source.getTrainers());

        if(source.getTrainers() != null && source.getTrainers().size() > 0){
            source.getTrainers().forEach(trainer-> client.getTrainers().add(
                    trainerService.findById(trainer)
                    )
            );
        }

        return client;
    }
}
