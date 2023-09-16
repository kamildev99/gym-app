package kd.springframework.gymapp.domain;


import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
public class TrainingPlan {

    private Long id;
    private String name;
    //sumarry sets on training plan
    private Long qtySeries;

    Set<Exercise> exercises = new HashSet<>();

}
