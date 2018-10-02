package jt.springframework.jtpetclinic.controllers;

import jt.springframework.jtpetclinic.services.VeterinarianService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Craeted by JT on 9/30/2018
 */
@Controller
public class VeterinarianController {

    private final VeterinarianService veterinarianService;

    public VeterinarianController(VeterinarianService veterinarianService) {
        this.veterinarianService = veterinarianService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(Model model) {

        model.addAttribute("vets", this.veterinarianService.findAll());

        return "vets/index";
    }
}
