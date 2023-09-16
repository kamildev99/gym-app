package kd.springframework.gymapp.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Setter
@Getter
public class Trainer extends Person {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    Set<Client> clients;

}
