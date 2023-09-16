package kd.springframework.gymapp.repositories;

import kd.springframework.gymapp.domain.TrainingPlan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrainingPlanRepository extends MongoRepository<TrainingPlan, Long> {
}
