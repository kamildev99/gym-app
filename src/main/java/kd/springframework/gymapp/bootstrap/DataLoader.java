package kd.springframework.gymapp.bootstrap;

import kd.springframework.gymapp.domain.Equipment;
import kd.springframework.gymapp.services.EquipmentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final EquipmentService equipmentService;

    public DataLoader(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("przykładowy tekst");
        List<Equipment> equipmentList = new ArrayList<>();
        equipmentList = equipmentService.findAll();
        System.out.println("List equipment");
        equipmentList.toString();
    }
}
