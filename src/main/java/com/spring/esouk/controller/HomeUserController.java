package com.spring.esouk.controller;

import com.spring.esouk.entity.service.ServiceInterfaceProduitHome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userHome")
public class HomeUserController {
    @Autowired
    private ServiceInterfaceProduitHome serviceProduit;
    @GetMapping("/user")
    public String showHomeUser(Model theModel)
    {

        theModel.addAttribute("fruits",serviceProduit.getProduits(1));
        theModel.addAttribute("legumes",serviceProduit.getProduits(2));
        theModel.addAttribute("produitMettre",serviceProduit.getProduitmettre());
        return "home";
    }
    @GetMapping("/{produit}")
    public String showProduit(@PathVariable("produit") String produitNom,Model theModel)
    {
        System.out.println(produitNom);
        System.out.println(serviceProduit.getProduitmettre(produitNom));
        theModel.addAttribute("fruits",serviceProduit.getProduits(1));
        theModel.addAttribute("legumes",serviceProduit.getProduits(2));
        theModel.addAttribute("produitMettre",serviceProduit.getProduitmettre(produitNom));
        return "home";
    }
}
