package kd.springframework.gymapp.converters;

import kd.springframework.gymapp.commands.ClientCommand;
import kd.springframework.gymapp.domain.Client;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ClientCommandToClient implements Converter<ClientCommand, Client> {
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
        client.setBirthDate(source.getBirthDate());

        return client;
    }
}
