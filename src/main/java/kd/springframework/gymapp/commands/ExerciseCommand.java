package kd.springframework.gymapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@NoArgsConstructor
public class ExerciseCommand {
    @Id
    private String id;
    private String name;
    private String description;
    //repetiion or duration on of them must be filled
    private Integer duration;
    private Integer repetitions;
}
