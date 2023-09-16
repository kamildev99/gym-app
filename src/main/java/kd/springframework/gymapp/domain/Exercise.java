package kd.springframework.gymapp.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Exercise {
    //for very client (maybe for trainers too)
    private Long id;
    private String name;
    private String description;
    //repetiion or duration on of them must be filled
    private Integer duration;
    private Integer repetitions;
    //could be empty
    private Equipment equipment;

}
