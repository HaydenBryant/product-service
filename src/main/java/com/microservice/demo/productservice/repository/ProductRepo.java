package com.microservice.demo.productservice.repository;

import com.microservice.demo.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo  extends MongoRepository<Product, String> {
}
