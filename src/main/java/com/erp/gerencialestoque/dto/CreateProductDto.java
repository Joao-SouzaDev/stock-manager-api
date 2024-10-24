package com.erp.gerencialestoque.dto;

import com.erp.gerencialestoque.model.UnitOfMeasure;

public class CreateProductDto {
    private String reference;
    private String description;
    private UnitOfMeasure unitOfMeasure;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }
}
