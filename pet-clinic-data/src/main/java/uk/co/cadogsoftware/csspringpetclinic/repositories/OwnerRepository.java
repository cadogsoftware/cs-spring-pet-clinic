package uk.co.cadogsoftware.csspringpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import uk.co.cadogsoftware.csspringpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
