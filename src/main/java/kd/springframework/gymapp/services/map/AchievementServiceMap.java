package kd.springframework.gymapp.services.map;

import kd.springframework.gymapp.domain.Achievement;
import kd.springframework.gymapp.services.AchievementService;

import java.util.AbstractMap;
import java.util.List;
import java.util.Set;

public class AchievementServiceMap extends AbstractMap<Achievement, Long> implements AchievementService {
    @Override
    public Set<Entry<Achievement, Long>> entrySet() {
        return null;
    }

    @Override
    public List<Achievement> findAll() {
        return null;
    }

    @Override
    public Achievement findById(String aLong) {
        return null;
    }

    @Override
    public Achievement save(Achievement object) {
        return null;
    }

    @Override
    public void delete(Achievement object) {

    }

    @Override
    public void deleteById(String aLong) {

    }
}
