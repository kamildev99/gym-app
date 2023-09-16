package kd.springframework.gymapp.repositories;

import kd.springframework.gymapp.domain.Achievement;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AchievementRepository extends MongoRepository<Achievement, Long> {


}
