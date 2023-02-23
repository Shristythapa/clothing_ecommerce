package com.example.stuff.repo;

import com.example.stuff.Entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {

@Query(value = "select * from products s where s.name like %:keyword% ", nativeQuery = true)
List<Product> findByKeyword(@Param("keyword") String keyword);

}