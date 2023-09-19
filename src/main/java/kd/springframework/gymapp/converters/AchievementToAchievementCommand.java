package kd.springframework.gymapp.converters;

import kd.springframework.gymapp.commands.AchievementCommand;
import kd.springframework.gymapp.domain.Achievement;
import lombok.Synchronized;


import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class AchievementToAchievementCommand implements Converter<Achievement, AchievementCommand> {
    @Synchronized
    @Nullable
    @Override
    public AchievementCommand convert(Achievement source) {
       if(source == null){
           return null;
       }

       AchievementCommand achievementCommand = new AchievementCommand();
       achievementCommand.setName(source.getName());
       achievementCommand.setId(source.getId());
       achievementCommand.setDescription(source.getDescription());
       achievementCommand.setDateOfAward(source.getDateOfAward());

       return achievementCommand;
    }
}
