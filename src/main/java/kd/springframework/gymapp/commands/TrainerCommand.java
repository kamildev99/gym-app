package kd.springframework.gymapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@Document(collection = "Trainer")
public class TrainerCommand {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String birthDate;
}
