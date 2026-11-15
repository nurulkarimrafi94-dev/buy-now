package com.rafbar.buynow.products.repository;

import com.rafbar.buynow.products.entity.Product;
import com.rafbar.buynow.products.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepo extends JpaRepository<Review, Long> {

    List<Review> findByProduct(Product product);
}
