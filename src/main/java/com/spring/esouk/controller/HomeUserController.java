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
//affichage de l'interface Client
public class HomeUserController {
    @Autowired
    private ServiceInterfaceProduitHome serviceProduit;
    @GetMapping("/user")
    public String showHomeUser(Model theModel)
    {

        theModel.addAttribute("fruits",serviceProduit.getProduits(1));//Affichage des fruits qui se touvent dans la barre categorie
        theModel.addAttribute("legumes",serviceProduit.getProduits(2));//Affichage des Legumes qui se touvent dans la barre categorie
        theModel.addAttribute("produitMettre",serviceProduit.getProduitmettre());//Affichage les produits des agriculteurs
        return "home";
    }
    @GetMapping("/{produit}")
    //Affichage les produits des agriculteurs mais qui vend juste le {produit} (ex:pomme)
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
