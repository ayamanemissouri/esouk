package com.spring.esouk.controller;

import com.spring.esouk.entity.Agriculteur;
import com.spring.esouk.entity.Produitmettre;
import com.spring.esouk.entity.dao.AgriculteurRepository;
import com.spring.esouk.entity.dao.ProductRepository;
import com.spring.esouk.entity.dao.ProduitmettreRepository;
import com.spring.esouk.entity.service.ServiceInterfaceProduitHome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AgriculteurController {
    @Autowired
    private ServiceInterfaceProduitHome serviceProduit;
    @Autowired
    private AgriculteurRepository agrdao;
    @Autowired
    private ProductRepository produitDao;
    @Autowired
    private ProduitmettreRepository produitmettreDao;

    @GetMapping("/agriculteur")
    public String showHome(Model theModel)
    {
        Agriculteur agr=agrdao.findById(1);
        theModel.addAttribute("produitmettre",serviceProduit.getProduitmettre(agr));
        theModel.addAttribute("produits",serviceProduit.getProduits());
        theModel.addAttribute("produitmettre1",new Produitmettre());

        return "agrHome";
    }


    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("produitmettre1") Produitmettre produit)
    {
        System.out.println(produit);
        produitmettreDao.save(produit);
        return "redirect:/agriculteur";
    }
    @RequestMapping(value="/delete")
    public String delete(Integer id) {
        produitmettreDao.deleteById(id);
        return "redirect:/agriculteur";
    }

}
