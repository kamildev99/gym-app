package kd.springframework.gymapp.repositories;

import kd.springframework.gymapp.domain.Equipment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EquipmentRepository extends MongoRepository<Equipment, Long> {
}
