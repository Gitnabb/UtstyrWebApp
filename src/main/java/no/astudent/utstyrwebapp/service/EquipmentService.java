package no.astudent.utstyrwebapp.service;
import no.astudent.utstyrwebapp.Equipment;
import no.astudent.utstyrwebapp.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentService {

    private final EquipmentRepository equipmentRepository;

    @Autowired
    public EquipmentService(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }


    public Equipment addEquipment(Equipment equipment){

        equipmentRepository.save(equipment);
        return equipment;

    }

    public void listAllEquipment(){

        equipmentRepository.findAll();

    }

}
