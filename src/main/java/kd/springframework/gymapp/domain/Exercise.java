package kd.springframework.gymapp.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "Exercise")
public class Exercise {
    //for very client (maybe for trainers too)
    @Id
    private String id;
    private String name;
    private String description;
    //repetiion or duration on of them must be filled
    private Integer duration;
    private Integer repetitions;
    //could be empty
    @DBRef
    private Equipment equipment;

}
