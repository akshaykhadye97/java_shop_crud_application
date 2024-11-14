package com.Shop_appllication.Shop_CRUD.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Data
@NoArgsConstructor
@Table(name="products")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false) // Product name should not be null
    private String name;

    @Column(name = "price", nullable = false) // Price should not be null
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY) // Many products can belong to one category
    @JoinColumn(name = "category_id", nullable = false) // Foreign key for Category
    @JsonIgnoreProperties("products")  // Avoid infinite recursion
    private Category category;
}
