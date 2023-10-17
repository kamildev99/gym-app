package kd.springframework.gymapp.commands;

import kd.springframework.gymapp.domain.Trainer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Document(collection = "Client")
public class ClientCommand {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    //age will be calculated
    private String birthDate;
    private List<String> trainers = new ArrayList<>();
}
