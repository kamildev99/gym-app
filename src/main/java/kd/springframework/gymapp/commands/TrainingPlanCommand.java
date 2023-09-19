package kd.springframework.gymapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@NoArgsConstructor
public class TrainingPlanCommand {
    @Id
    private String id;
    private String name;
    //sumarry sets on training plan
    private Long qtySeries;
}
