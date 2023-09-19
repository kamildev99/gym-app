package kd.springframework.gymapp.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "TrainingPlan")
public class TrainingPlan {
    @Id
    private String id;
    private String name;
    //sumarry sets on training plan
    private Long qtySeries;

    @DBRef
    Set<Exercise> exercises = new HashSet<>();

}
