package com.example.SpringRestApistoredata.controller;

import com.example.SpringRestApistoredata.dto.ProductDTO;
import com.example.SpringRestApistoredata.repository.ProductRepository;
import com.example.SpringRestApistoredata.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    private ProductService productService;

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(
            value = "/products",
            method = RequestMethod.POST)
    public ResponseEntity product(@RequestBody ProductDTO productDTO)
            throws Exception {

        System.out.println(productDTO);
        productService.create(productDTO);
        return new ResponseEntity<>(productDTO, HttpStatus.OK);

    }
}
