package uk.co.cadogsoftware.csspringpetclinic.services;

import uk.co.cadogsoftware.csspringpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
