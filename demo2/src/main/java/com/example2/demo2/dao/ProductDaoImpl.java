package com.example2.demo2.dao;

import com.example2.demo2.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProductDaoImpl implements ProductDao {
    public static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "ordianteur", 350));
        products.add(new Product (2, "Aspirateur", 500));
    }
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product save(Product product) {
        products.add(product);
        return product;
    }
}
