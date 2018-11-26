package com.example.SpringRestApistoredata;

import com.example.SpringRestApistoredata.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestApiStoreDataApplication {


    @Autowired
    ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringRestApiStoreDataApplication.class, args);
    }


}

