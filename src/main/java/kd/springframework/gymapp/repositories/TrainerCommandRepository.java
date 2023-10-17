package kd.springframework.gymapp.repositories;

import kd.springframework.gymapp.commands.TrainerCommand;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrainerCommandRepository extends MongoRepository<TrainerCommand, String> {
}
