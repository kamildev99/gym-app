package kd.springframework.gymapp.repositories;

import kd.springframework.gymapp.domain.Exercise;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExerciseRepository extends MongoRepository<Exercise, String> {
}
