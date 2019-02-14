package uk.co.cadogsoftware.csspringpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.co.cadogsoftware.csspringpetclinic.model.Owner;
import uk.co.cadogsoftware.csspringpetclinic.repositories.OwnerRepository;

@Controller
public class OwnerController {

    private OwnerRepository ownerRepository;

    public OwnerController(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @RequestMapping("/owners")
    public String getOwners(Model model) {

        model.addAttribute("owners", ownerRepository.findAll());

        return "owners"; // the view name
    }

    @RequestMapping("/owner/add")
    public String addOwner(Model model) {

        Owner owner = new Owner();
        owner.setFirstName("Rich");
        owner.setLastName("Mogs");

        ownerRepository.save(owner);

        model.addAttribute("owner", owner);

        return "owner_added"; // the view name
    }
}