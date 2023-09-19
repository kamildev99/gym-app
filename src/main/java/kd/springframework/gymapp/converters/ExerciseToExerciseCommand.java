package kd.springframework.gymapp.converters;

import kd.springframework.gymapp.commands.ExerciseCommand;
import kd.springframework.gymapp.domain.Exercise;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ExerciseToExerciseCommand implements Converter<Exercise, ExerciseCommand> {
    @Nullable
    @Synchronized
    @Override
    public ExerciseCommand convert(Exercise source) {
        if(source == null){
            return null;
        }

        ExerciseCommand exerciseCommand = new ExerciseCommand();
        exerciseCommand.setId(source.getId());
        exerciseCommand.setName(source.getName());
        exerciseCommand.setDescription(source.getDescription());
        exerciseCommand.setRepetitions(source.getRepetitions());
        exerciseCommand.setDuration(source.getDuration());

        return exerciseCommand;
    }
}
