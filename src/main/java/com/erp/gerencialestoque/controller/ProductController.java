package com.erp.gerencialestoque.controller;

import com.erp.gerencialestoque.dto.CreateProductDto;
import com.erp.gerencialestoque.model.Product;
import com.erp.gerencialestoque.repository.ProductRepository;
import com.erp.gerencialestoque.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<Product> findAll(){
        return productService.findAllProduct();
    };
    @GetMapping("/{id}")
    public Product findById(@PathVariable Integer id){
        return productService.findProductById(id);
    }
    @PostMapping
    public ResponseEntity<Product> save(@RequestBody CreateProductDto createProductDto) throws URISyntaxException {
        
        Product createdProduct = productService.createProduct(createProductDto);
        URI location = new URI("/api/products/" + createdProduct.getId());
        return ResponseEntity.created(location).body(createdProduct);
    }
}
