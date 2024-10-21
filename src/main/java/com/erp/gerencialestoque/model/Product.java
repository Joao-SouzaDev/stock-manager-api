package com.erp.gerencialestoque.model;


import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String referece;
    private String Description;
    private UnitOfMeasure UnitOfMeasure;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getReferece() {
        return referece;
    }

    public void setReferece(String referece) {
        this.referece = referece;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public com.erp.gerencialestoque.model.UnitOfMeasure getUnitOfMeasure() {
        return UnitOfMeasure;
    }

    public void setUnitOfMeasure(com.erp.gerencialestoque.model.UnitOfMeasure unitOfMeasure) {
        UnitOfMeasure = unitOfMeasure;
    }
}
