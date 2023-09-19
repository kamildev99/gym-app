package kd.springframework.gymapp.services.mongo;

import kd.springframework.gymapp.domain.Exercise;
import kd.springframework.gymapp.repositories.ExerciseRepository;
import kd.springframework.gymapp.services.ExerciseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class ExerciseMongoService implements ExerciseService {

    private final ExerciseRepository exerciseRepository;

    public ExerciseMongoService(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public List<Exercise> findAll() {
        List<Exercise> exercises = new ArrayList<>();
        exercises = exerciseRepository.findAll();
        return exercises;
    }

    @Override
    public Exercise findById(String aLong) {
        return exerciseRepository.findById(aLong).orElse(null);
    }

    @Override
    public Exercise save(Exercise object) {
        return exerciseRepository.save(object);
    }

    @Override
    public void delete(Exercise object) {
        exerciseRepository.delete(object);
    }

    @Override
    public void deleteById(String aLong) {
        exerciseRepository.deleteById(aLong);
    }
}
