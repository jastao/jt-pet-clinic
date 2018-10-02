package jt.springframework.jtpetclinic.controllers;

import jt.springframework.jtpetclinic.services.map.OwnerMapService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Craeted by JT on 9/30/2018
 */

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerMapService ownerMapService;

    public OwnerController(OwnerMapService ownerMapService) {
        this.ownerMapService = ownerMapService;
    }

    @RequestMapping({"/", "/index", "/index.html"})
    public String listOwners(Model model) {

        model.addAttribute("owners", this.ownerMapService.findAll());

        return "owners/index";
    }

}
