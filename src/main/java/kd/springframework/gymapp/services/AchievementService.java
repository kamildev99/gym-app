package kd.springframework.gymapp.services;


import kd.springframework.gymapp.domain.Achievement;
import org.springframework.data.repository.CrudRepository;

public interface AchievementService extends CrudService<Achievement, String> {
}
