package com.crm.crm.entity;
// Pritam bhai.
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Product {
    @Id
    private long id;
    private String name;
    private double price;
}
