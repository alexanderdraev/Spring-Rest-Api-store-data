package com.example.SpringRestApistoredata.service;

import com.example.SpringRestApistoredata.config.RabbitMQConfig;
import com.example.SpringRestApistoredata.dto.ProductDTO;
import com.example.SpringRestApistoredata.model.Product;
import com.example.SpringRestApistoredata.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final RabbitTemplate rabbitTemplate;

    private ProductRepository productRepository;

    private ModelMapper modelMapper;

    @Autowired
    public ProductService(RabbitTemplate rabbitTemplate, ProductRepository productRepository, ModelMapper modelMapper) {
        this.rabbitTemplate = rabbitTemplate;
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }


    public Product create(ProductDTO productDTO) {

        Product product = modelMapper.map(productDTO, Product.class);
        productRepository.save(product);

        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(RabbitMQConfig.exchangeName, "routing.key.name", "Hello, hello from RabbitMQ!");

        return product;
    }


}
