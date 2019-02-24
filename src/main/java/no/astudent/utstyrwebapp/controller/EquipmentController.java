package no.astudent.utstyrwebapp.controller;

import no.astudent.utstyrwebapp.Equipment;
import no.astudent.utstyrwebapp.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class EquipmentController {

    private final EquipmentService equipmentService;

    @Autowired
    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @RequestMapping(value = "showequipment", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("showequipment", "showequipment", new Equipment());

    }

    @RequestMapping(value = "addequipment", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("addequipment") Equipment equipment,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "Error";
        }

        equipment = equipmentService.addEquipment(equipment);

        // feltene du ønsker å inkludere
        model.addAttribute("equipmentId", equipment.getEquipmentId());
        model.addAttribute("equipmentName", equipment.getEquipmentName());
        model.addAttribute("equipmentBorrowDate", equipment.getBorrowDate());
        model.addAttribute("equipmentReturnDate", equipment.getReturnDate());
        model.addAttribute("equipmentTimeLeft", equipment.getRemainingBorrowTime());

        // siden du ønsker å vise
        return "showequipment";

    }

}
    /*
    @RequestMapping("addequipment") // Accepting equiment request
    public ModelAndView equipment(Equipment equipment) {

        ModelAndView mvEquipment = new ModelAndView();
        mvEquipment.addObject("EquipmentObj", equipment);
        mvEquipment.setViewName("addequipment"); // the add equipment page

        // print a request message
        System.out.println("Equipment added!");


        // Equipment equipment1 = new Equipment();

        return mvEquipment;

    }
*/
