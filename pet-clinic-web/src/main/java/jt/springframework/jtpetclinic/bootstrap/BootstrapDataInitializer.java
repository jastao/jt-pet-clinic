package jt.springframework.jtpetclinic.bootstrap;

import jt.springframework.jtpetclinic.model.Owner;
import jt.springframework.jtpetclinic.model.Veterinarian;
import jt.springframework.jtpetclinic.services.map.OwnerMapService;
import jt.springframework.jtpetclinic.services.map.VeterinarianMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Craeted by JT on 9/30/2018
 */
@Component
public class BootstrapDataInitializer implements CommandLineRunner {

    private final OwnerMapService ownerMapService;

    private final VeterinarianMapService veterinarianMapService;

    public BootstrapDataInitializer(OwnerMapService ownerMapService, VeterinarianMapService veterinarianMapService) {
        this.ownerMapService = ownerMapService;
        this.veterinarianMapService = veterinarianMapService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jacky");
        owner1.setLastName("Owens");
        this.ownerMapService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Joe");
        owner2.setLastName("Mark");
        this.ownerMapService.save(owner2);

        System.out.println("Loading Owners...");

        Veterinarian vet1 = new Veterinarian();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Morter");
        this.veterinarianMapService.save(vet1);

        Veterinarian vet2 = new Veterinarian();
        vet1.setId(2L);
        vet1.setFirstName("Pete");
        vet1.setLastName("Abraham");
        this.veterinarianMapService.save(vet2);

        System.out.println("Loading Vets...");

    }

}
