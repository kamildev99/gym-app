package kd.springframework.gymapp.converters;

import kd.springframework.gymapp.commands.EquipmentCommand;
import kd.springframework.gymapp.domain.Equipment;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;


public class EquipmentCommandToEquipment implements Converter<EquipmentCommand, Equipment> {
    @Nullable
    @Synchronized
    @Override
    public Equipment convert(EquipmentCommand source) {
        if(source == null){
            return null;
        }

        Equipment equipment = new Equipment();
        equipment.setId(source.getId());
        equipment.setName(source.getName());
        equipment.setWeight(source.getWeight());
        equipment.setLength(source.getLength());
        equipment.setHeight(source.getHeight());
        equipment.setWidth(source.getWidth());

        return equipment;
    }
}
