package kd.springframework.gymapp.repositories;

import kd.springframework.gymapp.domain.Equipment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentRepository extends MongoRepository<Equipment, String> {
}
