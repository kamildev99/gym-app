package kd.springframework.gymapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<ClientRepository, Long> {
}
