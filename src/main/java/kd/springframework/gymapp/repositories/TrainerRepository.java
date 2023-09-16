package kd.springframework.gymapp.repositories;

import kd.springframework.gymapp.domain.Trainer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrainerRepository extends MongoRepository<Trainer, Long> {
}
