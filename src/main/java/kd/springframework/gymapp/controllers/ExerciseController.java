package kd.springframework.gymapp.controllers;

import kd.springframework.gymapp.services.ExerciseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ExerciseController {

    private final ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping({"/exercises", "/exercises/index"})
    public String getExercises(){
        return "implement";
    }

}
