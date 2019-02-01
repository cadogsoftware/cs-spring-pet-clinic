package uk.co.cadogsoftware.csspringpetclinic.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import uk.co.cadogsoftware.csspringpetclinic.model.Owner;
import uk.co.cadogsoftware.csspringpetclinic.repositories.OwnerRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private OwnerRepository ownerRepository;

    public DevBootstrap(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        Owner eric = new Owner();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");
        ownerRepository.save(eric);

        Owner rod = new Owner();
        rod.setFirstName("rod");
        rod.setLastName("Davies");
        ownerRepository.save(rod);
    }
}