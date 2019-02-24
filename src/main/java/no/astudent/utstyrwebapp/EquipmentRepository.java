package no.astudent.utstyrwebapp;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

    /**
     * Find equipment based on equipment name.
     *
     * @param equipmentName
     */
    List<Equipment> findByEquipmentName(String equipmentName);

}
