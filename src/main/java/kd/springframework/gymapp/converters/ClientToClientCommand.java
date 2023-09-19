package kd.springframework.gymapp.converters;

import kd.springframework.gymapp.commands.ClientCommand;
import kd.springframework.gymapp.domain.Client;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ClientToClientCommand implements Converter<Client, ClientCommand> {

    @Nullable
    @Synchronized
    @Override
    public ClientCommand convert(Client source) {
        if(source == null){
            return null;
        }

        ClientCommand clientCommand = new ClientCommand();
        clientCommand.setId(source.getId());
        clientCommand.setFirstName(source.getFirstName());
        clientCommand.setLastName(source.getLastName());
        clientCommand.setBirthDate(source.getBirthDate());

        return clientCommand;
    }
}
