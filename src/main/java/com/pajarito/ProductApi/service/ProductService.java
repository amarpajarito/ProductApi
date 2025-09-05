package com.pajarito.ProductApi.service;

import com.pajarito.ProductApi.model.Product;
import com.pajarito.ProductApi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts()
    {
        List<Product>productRecords = new ArrayList<>();
        productRepository.findAll().forEach(productRecords::add);
        return productRecords;
    }
    public Product addProduct(Product product)
    {
        return productRepository.save(product);
    }
    public Product updateProduct(Product product)
    {
        return productRepository.save(product);
    }
    public Product getProduct(int id)
    {
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()) {
            return product.get();
        }
        else
            return null;
    }
    public void deleteProduct(int id)
    {
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()) {
            productRepository.delete(product.get());
        }
    }
}
