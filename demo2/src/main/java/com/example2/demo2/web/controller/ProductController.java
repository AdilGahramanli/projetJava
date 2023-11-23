package com.example2.demo2.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/Produits")
    public String listeProduits() {
        return "Un exemple de produits";
    }

    @GetMapping("/Produits/{id}")
    public String afficherUnProduit(@PathVariable int id) {
        return "Vous avez demandé un produit avec l'id" + id;
    }

}
