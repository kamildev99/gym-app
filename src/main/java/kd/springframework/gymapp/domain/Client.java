package kd.springframework.gymapp.domain;

import com.fasterxml.jackson.databind.DatabindException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Client")
public class Client extends Person {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    //age will be calculated
    private LocalDate birthDate;
    private Set<Trainer> trainers;


}
