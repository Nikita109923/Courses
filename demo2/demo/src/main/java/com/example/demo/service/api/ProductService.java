package com.example.demo.service.api;

import com.example.demo.dao.api.ProductDao;
import com.example.demo.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductService implements IProductService {
    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    @Transactional
    public void add(Product product) {
        this.productDao.add(product);

    }

    @Override
    @Transactional
    public void update(Product product) {
    this.productDao.update(product);
    }

    @Override
    @Transactional
    public void delete(long id) {
    this.productDao.delete(id);
    }

    @Override
    @Transactional
    public Product getProductById(long id) {
        return this.productDao.getProductById(id);
    }

    @Override
    @Transactional
    public List<Product> listProduct() {
        return this.productDao.listProduct();
    }
}

