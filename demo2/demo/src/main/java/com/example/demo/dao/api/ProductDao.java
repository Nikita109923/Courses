package com.example.demo.dao.api;

import com.example.demo.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDao implements IProductDao{
    private static final Logger logger =  LoggerFactory.getLogger(ProductDao.class);
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(Product product) {
        Session session =this.sessionFactory.getCurrentSession();
        session.persist(product);
        logger.info("Product successfully add. Information : " + product);

    }

    @Override
    public void update(Product product) {
        Session session =this.sessionFactory.getCurrentSession();
        session.update(product);
        logger.info("Product successfully update. Information : " + product);
    }

    @Override
    public void delete(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Product product = (Product) session.load(Product.class, new Long(id));

        if (product!=null){
            session.delete(product);
        }
        logger.info("Product successfully delete. Information : " + product);

    }

    @Override
    public Product getProductById(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Product product = (Product) session.load(Product.class,new Long(id));
        logger.info("Product successfully loaded. Information : " + product);

        return product;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Product> listProduct() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Product> productList = session.createQuery("from Product").list();
        for (Product product : productList) {
            logger.info("Product list : " + product);
        }
        return productList;
    }
}
