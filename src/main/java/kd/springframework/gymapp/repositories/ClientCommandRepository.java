package kd.springframework.gymapp.repositories;

import kd.springframework.gymapp.commands.ClientCommand;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientCommandRepository extends MongoRepository<ClientCommand, String> {
}
