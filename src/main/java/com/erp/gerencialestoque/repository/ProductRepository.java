package com.erp.gerencialestoque.repository;

import com.erp.gerencialestoque.model.Product;
import org.springframework.data.repository.Repository;

public interface ProductRepository extends Repository<Product,Integer> {
    Product save(Product product);
    Product findById(Integer id);
}
