package kd.springframework.gymapp.controllers;

import jakarta.annotation.PostConstruct;
import kd.springframework.gymapp.domain.Equipment;
import kd.springframework.gymapp.repositories.EquipmentRepository;
import kd.springframework.gymapp.services.EquipmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class EquipmentController {

    private final EquipmentService equipmentService;

    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @GetMapping("/equipments")
    public List<Equipment> getEquipment(){
        List<Equipment> equipment = new ArrayList<>();
        equipment = equipmentService.findAll();
        return equipment;

    }

    // private final EquipmentRepository equipmentService;

   /* public EquipmentController(EquipmentRepository equipmentService) {
        this.equipmentService = equipmentService;
    }*/

    /*
    @GetMapping("/equipments")
    public List<Equipment> getEquipment(){
        List<Equipment> equipment = new ArrayList<>();
        equipment = equipmentService.findAll();
        return equipment;

    }*/
}
