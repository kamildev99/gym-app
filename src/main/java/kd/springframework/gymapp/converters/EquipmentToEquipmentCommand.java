package kd.springframework.gymapp.converters;

import kd.springframework.gymapp.commands.EquipmentCommand;
import kd.springframework.gymapp.domain.Equipment;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class EquipmentToEquipmentCommand implements Converter<Equipment, EquipmentCommand> {
    @Nullable
    @Synchronized
    @Override
    public EquipmentCommand convert(Equipment source) {
        if(source == null){
            return null;
        }

        EquipmentCommand equipmentCommand = new EquipmentCommand();
        equipmentCommand.setId(source.getId());
        equipmentCommand.setName(source.getName());
        equipmentCommand.setWeight(source.getWeight());
        equipmentCommand.setWidth(source.getWidth());
        equipmentCommand.setHeight(source.getHeight());
        equipmentCommand.setLength(source.getLength());

        return equipmentCommand;
    }
}
