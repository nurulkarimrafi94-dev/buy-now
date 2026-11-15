package com.rafbar.buynow.products.repository;

import com.rafbar.buynow.products.entity.Category;
import com.rafbar.buynow.products.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ProductRepo extends JpaRepository<Product, UUID> {

    @Query("SELECT p from Product p join p.categories c where c.id = :categoryId")
    List<Product> findByCategoryId(@Param("categoryId") String categoryId);
}
