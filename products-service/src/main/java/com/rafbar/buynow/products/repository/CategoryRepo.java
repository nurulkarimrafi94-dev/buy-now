package com.rafbar.buynow.products.repository;

import com.rafbar.buynow.products.entity.Category;
import com.rafbar.buynow.products.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepo extends JpaRepository<Category, Long> {

    @Query("SELECT c from Category c join c.products p where p.id = :productId")
    List<Product> findByProductId(@Param("productId") String productId);
}
