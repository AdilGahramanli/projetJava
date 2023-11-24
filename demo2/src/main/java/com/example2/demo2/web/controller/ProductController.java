package com.example2.demo2.web.controller;
import com.example2.demo2.dao.ProductDao;
import com.example2.demo2.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
public class ProductController {

    private final ProductDao productDao;

    public ProductController(ProductDao productDao) {
        this.productDao = productDao;
    }
    @GetMapping("/Produits")
    public List <Product> listeProduits() {
        return productDao.findAll();
    }

    @GetMapping(value = "/Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id) {

        return productDao.findById(id);
    }

}
