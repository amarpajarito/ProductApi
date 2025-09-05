package com.pajarito.ProductApi.controller;

import com.pajarito.ProductApi.model.Product;
import com.pajarito.ProductApi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @RequestMapping(value="/products/{id}")
    public Product getProduct(@PathVariable int id)
    {
        return productService.getProduct(id);
    }

    @RequestMapping(value="/add-product", method= RequestMethod.POST)
    public Product addProduct(@RequestBody Product product)
    {
        return productService.addProduct(product);
    }

    @RequestMapping(value="/update-product", method=RequestMethod.PUT)
    public Product updateProduct(@RequestBody Product product)
    {
        return productService.updateProduct(product);
    }
    @RequestMapping(value="/products/{id}", method=RequestMethod.DELETE)
    public void deleteProduct(@PathVariable int id)
    {
        productService.deleteProduct(id);
    }
}
