package com.example.SpringRestApistoredata.service;

import com.example.SpringRestApistoredata.dto.ProductDTO;
import com.example.SpringRestApistoredata.model.Product;
import com.example.SpringRestApistoredata.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product create(ProductDTO productDTO) {

        System.out.println(productDTO);
        Product product = modelMapper.map(productDTO, Product.class);
        productRepository.save(product);

        return product;
    }


}
