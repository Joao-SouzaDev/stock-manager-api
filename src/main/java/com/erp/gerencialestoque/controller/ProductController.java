package com.erp.gerencialestoque.controller;

import com.erp.gerencialestoque.model.Product;
import com.erp.gerencialestoque.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @GetMapping
    public List<Product> findAll(){
        return productRepository.findAll();
    };
    @GetMapping("/{id}")
    public Product findById(@PathVariable Integer id){
        return productRepository.findById(id);
    }
}
