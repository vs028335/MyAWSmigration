package com.sears.SpringBootLearn.productReposiitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sears.SpringBootLearn.pojo.Product;
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
