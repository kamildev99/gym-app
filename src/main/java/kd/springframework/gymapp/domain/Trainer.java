package kd.springframework.gymapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection ="Trainer")
public class Trainer extends Person {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    List<Client> clients;

}
