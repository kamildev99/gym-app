package kd.springframework.gymapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@NoArgsConstructor
public class EquipmentCommand {
    @Id
    private String id; //change type to Long in mongodb or String or converter use if will work
    private String name;
    //these properties optionall - not all must be filled
    private Double width;
    private Double length;
    private Double height;
    private Double weight;

}
