package kd.springframework.gymapp.services.mongo;

import kd.springframework.gymapp.domain.Trainer;
import kd.springframework.gymapp.repositories.TrainerRepository;
import kd.springframework.gymapp.services.TrainerService;
import kd.springframework.gymapp.services.TrainingPlanService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class TrainerMongoService implements TrainerService {

    private final TrainerRepository trainerRepository;

    public TrainerMongoService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public List<Trainer> findAll() {
       List<Trainer> trainers = new ArrayList<>();
       trainers = trainerRepository.findAll();
        return trainers;
    }

    @Override
    public Trainer findById(String aLong) {
        return trainerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Trainer save(Trainer object) {
        return trainerRepository.save(object);
    }

    @Override
    public void delete(Trainer object) {
        trainerRepository.delete(object);
    }

    @Override
    public void deleteById(String aLong) {
        trainerRepository.deleteById(aLong);
    }
}
