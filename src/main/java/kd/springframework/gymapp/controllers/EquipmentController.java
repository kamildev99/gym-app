package kd.springframework.gymapp.controllers;

import jakarta.annotation.PostConstruct;
import kd.springframework.gymapp.domain.Equipment;
import kd.springframework.gymapp.repositories.EquipmentRepository;
import kd.springframework.gymapp.services.EquipmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class EquipmentController {

    private final EquipmentRepository equipmentService;

    public EquipmentController(EquipmentRepository equipmentService) {
        this.equipmentService = equipmentService;
    }


   /* @GetMapping("/hello")
    public String getEquipment(){
        String jsonData = "{\"id\": 123, \"name\": \"example\", \"otherField\": \"otherValue\"}";
        return jsonData;

    }*/
   /*@PostConstruct
   public void init() {
       Equipment equipment = new Equipment();
       equipment.setHeight(12.0);
       equipment.setLength(34.0);
       equipment.setName("tessdsdt");
       equipment.setWeight(123.0);
       equipment.setWidth(12.0);

       equipmentService.save(equipment);
   }*/

    @GetMapping("/hello")
    public List<Equipment> getEquipment(){
        List<Equipment> equipment = new ArrayList<>();
        equipment = equipmentService.findAll();
        return equipment;

    }
}
