package com.Shop_appllication.Shop_CRUD.Repository;

import com.Shop_appllication.Shop_CRUD.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Category_Repo extends JpaRepository<Category, Long> {

}
