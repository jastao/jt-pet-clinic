package jt.springframework.jtpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Craeted by JT on 9/30/2018
 */

@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"/", "/index", "/index.html"})
    public String listOwners() {
        return "owners/index";
    }

}
