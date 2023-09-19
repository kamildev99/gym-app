package kd.springframework.gymapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class TrainerCommand {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
}
