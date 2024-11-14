package com.Shop_appllication.Shop_CRUD.Repository;

import com.Shop_appllication.Shop_CRUD.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Product_Repo extends JpaRepository<Product,Long> {
}
