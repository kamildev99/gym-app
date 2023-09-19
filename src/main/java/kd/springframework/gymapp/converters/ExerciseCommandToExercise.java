package kd.springframework.gymapp.converters;

import kd.springframework.gymapp.commands.ExerciseCommand;
import kd.springframework.gymapp.domain.Exercise;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ExerciseCommandToExercise implements Converter<ExerciseCommand, Exercise> {
    @Nullable
    @Synchronized
    @Override
    public Exercise convert(ExerciseCommand source) {
        if(source == null){
            return null;
        }

        Exercise exercise = new Exercise();
        exercise.setId(source.getId());
        exercise.setName(source.getName());
        exercise.setDescription(source.getDescription());
        exercise.setDuration(source.getDuration());
        exercise.setRepetitions(source.getRepetitions());

        return exercise;
    }
}
