package kd.springframework.gymapp.domain;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Equipment {

    private Long id;
    private String name;
    //these properties optionall - not all must be filled
    private Double width;
    private Double length;
    private Double height;
    private Double weight;

}
