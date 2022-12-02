package com.example.spring_security_session_java7.service;

import com.example.spring_security_session_java7.entities.Product;
import com.example.spring_security_session_java7.reposity.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl {

    private final ProductRepository productRepository;

    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public Product findByIdProduct(Long id) {
        return productRepository.findById(id).get();
    }

    public void deleteByIdProduct(Long id) {
        productRepository.deleteById(id);
    }
}
