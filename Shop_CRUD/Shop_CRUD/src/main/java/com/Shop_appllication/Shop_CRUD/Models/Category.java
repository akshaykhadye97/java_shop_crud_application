package com.Shop_appllication.Shop_CRUD.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name="categories")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "products"})  // Avoid infinite recursion
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, unique = true) // Category name should be unique and not null
    private String name;

    @Column(name = "description") // Optional description column
    private String description;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnoreProperties("category")  // Avoid infinite recursion in the bidirectional relationship
    private List<Product> products;

}
