package uk.co.cadogsoftware.csspringpetclinic.services;

import uk.co.cadogsoftware.csspringpetclinic.model.Pet;
import uk.co.cadogsoftware.csspringpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
