package kd.springframework.gymapp.services.mongo;

import kd.springframework.gymapp.converters.TrainerCommandToTrainer;
import kd.springframework.gymapp.domain.Trainer;
import kd.springframework.gymapp.repositories.TrainerCommandRepository;
import kd.springframework.gymapp.repositories.TrainerRepository;
import kd.springframework.gymapp.services.TrainerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrainerMongoService implements TrainerService {

    private final TrainerRepository trainerRepository;
    private final TrainerCommandRepository trainerCommandRepository;

    private final TrainerCommandToTrainer trainerCommandToTrainer;

    public TrainerMongoService(TrainerRepository trainerRepository, TrainerCommandRepository trainerCommandRepository, TrainerCommandToTrainer trainerCommandToTrainer) {
        this.trainerRepository = trainerRepository;
        this.trainerCommandRepository = trainerCommandRepository;
        this.trainerCommandToTrainer = trainerCommandToTrainer;
    }

    @Override
    public List<Trainer> findAll() {
       List<Trainer> trainers = new ArrayList<>();
       trainers = trainerCommandRepository.findAll().stream()
               .map(trainerCommandToTrainer::convert)
               .collect(Collectors.toList());

       //trainers = trainerRepository.findAll();
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
