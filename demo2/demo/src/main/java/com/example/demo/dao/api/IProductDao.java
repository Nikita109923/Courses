package com.example.demo.dao.api;

import com.example.demo.entity.Product;

import java.util.List;

public interface IProductDao {
    void add(Product product);
    void update(Product product);
    void delete(long id);
    Product getProductById(long id);
    List<Product> listProduct();

}
