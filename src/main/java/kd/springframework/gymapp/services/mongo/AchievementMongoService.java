package kd.springframework.gymapp.services.mongo;

import kd.springframework.gymapp.domain.Achievement;
import kd.springframework.gymapp.repositories.AchievementRepository;
import kd.springframework.gymapp.services.AchievementService;

import java.util.*;

public class AchievementMongoService implements AchievementService {
    private final AchievementRepository achievementRepository;

    public AchievementMongoService(AchievementRepository achievementRepository) {
        this.achievementRepository = achievementRepository;
    }

    @Override
    public List<Achievement> findAll() {
        List<Achievement> achievements = new ArrayList<>();
        achievements = achievementRepository.findAll();
        return achievements;
    }

    @Override
    public Achievement findById(String aLong) {
        return achievementRepository.findById(aLong).orElse(null);
    }

    @Override
    public Achievement save(Achievement object) {
        return achievementRepository.save(object);
    }

    @Override
    public void delete(Achievement object) {
        achievementRepository.delete(object);
    }

    @Override
    public void deleteById(String aLong) {
        achievementRepository.deleteById(aLong);
    }
}
