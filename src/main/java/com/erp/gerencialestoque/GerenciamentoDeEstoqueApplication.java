package com.erp.gerencialestoque;

import com.erp.gerencialestoque.model.Product;
import com.erp.gerencialestoque.model.UnitOfMeasure;
import com.erp.gerencialestoque.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GerenciamentoDeEstoqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciamentoDeEstoqueApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(ProductRepository productRepository){
		return args -> {
			Product product = new Product();
			product.setReferece("VL013");
			product.setDescription("Vestido longo borado");
			product.setUnitOfMeasure(UnitOfMeasure.Foot);
			Product saved = productRepository.save(product);
		};
	}
}

