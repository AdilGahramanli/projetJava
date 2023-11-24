package com.example2.demo2.dao;

import com.example2.demo2.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

public interface ProductDao {
    List<Product> findAll();
    Product findById(int id);
    Product save(Product product);
}
