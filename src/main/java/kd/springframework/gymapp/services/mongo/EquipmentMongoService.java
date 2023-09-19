package kd.springframework.gymapp.services.mongo;

import kd.springframework.gymapp.domain.Equipment;
import kd.springframework.gymapp.repositories.EquipmentRepository;
import kd.springframework.gymapp.services.EquipmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@Profile({"default", "mongo"})
public class EquipmentMongoService implements EquipmentService {

    private final EquipmentRepository equipmentRepository;

    public EquipmentMongoService(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    @Override
    public List<Equipment> findAll() {
        List<Equipment> equipment = new ArrayList<>();
        equipment = equipmentRepository.findAll();
        return equipment;
    }

    @Override
    public Equipment findById(String aLong) {
        return equipmentRepository.findById(aLong).orElse(null);
    }

    @Override
    public Equipment save(Equipment object) {
        return equipmentRepository.save(object);
    }

    @Override
    public void delete(Equipment object) {
        equipmentRepository.delete(object);
    }

    @Override
    public void deleteById(String aLong) {
        equipmentRepository.deleteById(aLong);
    }
}
