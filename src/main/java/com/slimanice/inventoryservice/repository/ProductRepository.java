package com.slimanice.inventoryservice.repository;

import com.slimanice.inventoryservice.entitty.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
