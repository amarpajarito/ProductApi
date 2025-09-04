package com.pajarito.ProductApi.repository;

import com.pajarito.ProductApi.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
{
}
