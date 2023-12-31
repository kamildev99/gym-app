package kd.springframework.gymapp.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Equipment")
public class Equipment {
    @Id
    private String id; //change type to Long in mongodb or String or converter use if will work
    private String name;
    //these properties optionall - not all must be filled
    private Double width;
    private Double length;
    private Double height;
    private Double weight;

}
