package kd.springframework.gymapp.converters;

import kd.springframework.gymapp.commands.AchievementCommand;
import kd.springframework.gymapp.domain.Achievement;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class AchievementCommandToAchievement implements Converter<AchievementCommand, Achievement> {
    @Synchronized
    @Nullable
    @Override
    public Achievement convert(AchievementCommand source) {
        if(source ==null){
            return null;
        }

        final Achievement achievement = new Achievement();
        achievement.setId(source.getId());
        achievement.setName(source.getName());
        achievement.setDescription(source.getDescription());
        achievement.setDateOfAward(source.getDateOfAward());
        return achievement;
    }
}
