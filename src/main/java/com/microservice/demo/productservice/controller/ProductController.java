package com.microservice.demo.productservice.controller;

import com.microservice.demo.productservice.model.Product;
import com.microservice.demo.productservice.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAll(){
        return productRepo.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Product product){
        productRepo.save(product);
    }
}
