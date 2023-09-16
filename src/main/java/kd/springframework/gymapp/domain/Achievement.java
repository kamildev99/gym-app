package kd.springframework.gymapp.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Achievement {

    private Long id;
    private String name;
    private String description;
    private LocalDate dateOfAward;
    //maybe add category for this o.e. running, bodybuilding, powerlifting etc.???

}
