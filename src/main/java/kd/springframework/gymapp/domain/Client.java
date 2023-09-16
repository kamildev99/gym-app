package kd.springframework.gymapp.domain;

import com.fasterxml.jackson.databind.DatabindException;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Setter
@Getter
public class Client extends Person {

    private Long id;
    private String firstName;
    private String lastName;
    //age will be calculated
    private LocalDate birthDate;
    private Set<Trainer> trainers;


}
