package com.spring.esouk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProduitDetailController {
    @GetMapping("/produitdetail")
    public String showProduit(Model theModel)
    {
        return "ProduitFile";
    }
}
