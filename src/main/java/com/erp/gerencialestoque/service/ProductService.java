package com.erp.gerencialestoque.service;

import com.erp.gerencialestoque.dto.CreateProductDto;
import com.erp.gerencialestoque.mapper.ProductMapper;
import com.erp.gerencialestoque.model.Product;
import com.erp.gerencialestoque.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Product createProduct(CreateProductDto createProductDto) {
        Product product = ProductMapper.INSTANCE.toEntity(createProductDto);
        return productRepository.save(product);
    }
    public Product findProductById(Integer id) {
        return productRepository.findById(id);
    }
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }
}
