package kd.springframework.gymapp.controllers;

import kd.springframework.gymapp.domain.Trainer;
import kd.springframework.gymapp.services.TrainerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class TrainerController {
    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping("/trainers")
    public List<Trainer> getTrainers(){

        List<Trainer> trainers = new ArrayList<>();
        trainers = trainerService.findAll();
        return trainers;
    }
}
