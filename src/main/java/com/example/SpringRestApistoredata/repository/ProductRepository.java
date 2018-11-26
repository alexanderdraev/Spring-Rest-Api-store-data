package com.example.SpringRestApistoredata.repository;

import com.example.SpringRestApistoredata.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {


}
