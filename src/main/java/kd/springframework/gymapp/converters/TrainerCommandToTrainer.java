package kd.springframework.gymapp.converters;

import kd.springframework.gymapp.ConversionService;
import kd.springframework.gymapp.commands.TrainerCommand;
import kd.springframework.gymapp.domain.Client;
import kd.springframework.gymapp.domain.Trainer;
import lombok.Synchronized;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class TrainerCommandToTrainer implements Converter<TrainerCommand, Trainer> {


    //private final ClientCommandToClient clientCommandToClient;

   /* public TrainerCommandToTrainer(ClientCommandToClient clientCommandToClient) {
        this.clientCommandToClient = clientCommandToClient;
    }*/

    @Nullable
    @Synchronized
    @Override
    public Trainer convert(TrainerCommand source) {
        if(source == null){
            return null;
        }

        Trainer trainer = new Trainer();
        trainer.setId(source.getId());
        trainer.setFirstName(source.getFirstName());
        trainer.setLastName(source.getLastName());
        trainer.setBirthDate(LocalDate.parse(source.getBirthDate(), DateTimeFormatter.ofPattern("dd-MM-yyyy")));

      /*  if(source.getClients() != null && source.getClients().size() > 0){
            source.getClients().forEach(client -> trainer.getClients().add(clientCommandToClient.convertToClient(client)));
        }*/

        return trainer;
    }
}
