package com.erp.gerencialestoque.mapper;

import com.erp.gerencialestoque.dto.CreateProductDto;
import org.mapstruct.Mapper;
import com.erp.gerencialestoque.model.Product;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    // mapper Instance
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    //Map CreateProductDto from Product
    Product toEntity(CreateProductDto dto);
}

