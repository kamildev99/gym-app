package kd.springframework.gymapp.services.mongo;

import kd.springframework.gymapp.domain.TrainingPlan;
import kd.springframework.gymapp.services.TrainingPlanService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class TrainingPlanMongoService implements TrainingPlanService {
    @Override
    public List<TrainingPlan> findAll() {
        return null;
    }

    @Override
    public TrainingPlan findById(String aLong) {
        return null;
    }

    @Override
    public TrainingPlan save(TrainingPlan object) {
        return null;
    }

    @Override
    public void delete(TrainingPlan object) {

    }

    @Override
    public void deleteById(String aLong) {

    }
}
