package com.spring.esouk.controller;

import com.spring.esouk.entity.Produit;
import com.spring.esouk.entity.Souk;
import com.spring.esouk.entity.service.ServiceInterfaceProduitHome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	@Autowired
	private ServiceInterfaceProduitHome serviceProduit;
	private int rec=0;
	
	@SuppressWarnings("null")
	@GetMapping("/home")
	public String showHome(Model theModel)
	{
		Souk souk=serviceProduit.getSoukInTime();
	
		if( rec == 0)
		{
		theModel.addAttribute("produits",serviceProduit.getProduits());}
		theModel.addAttribute("produit",new Produit());
		theModel.addAttribute("souk",souk);
		return "eSouk";
	}
	
	@PostMapping("/searchProduit")
	public String searchProduit(Model theModel,@ModelAttribute("produit") Produit produit)
	
	{
		String nom=produit.getDesignation();
		Produit pr=serviceProduit.searchProduit(nom);
		rec=1;
		theModel.addAttribute("produits",pr);
		
		
	return showHome(theModel);

}

}
	
