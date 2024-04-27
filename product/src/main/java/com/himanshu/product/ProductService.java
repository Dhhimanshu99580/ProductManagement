package com.himanshu.product;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
//    List<Product> listOfProducts = new ArrayList<Product>();
//
//    productDb db = new productDb();
//
//    public ProductService() throws SQLException {
//    }
//
//
//    public void addProduct(Product p) throws SQLException {
//        //listOfProducts.add(p);
//        db.save(p);
//    }
//
//    public List<Product> getProduct() throws SQLException {
//        return db.getAll();
//        //return listOfProducts;
//    }
//
//    public List<Product> getParticularProduct(String windows) {
//        List<Product> listOfproducts = new ArrayList<Product>();
//        for(Product p: listOfProducts) {
//            if(p.getPlace().equals(windows)) {
//                listOfproducts.add(p);
//            }
//        }
//        return listOfproducts;
//    }
//    public List<Product> getParticularProduct(int warranty) {
//        List<Product> listOfWarrantyLessThanGiven = new ArrayList<Product>();
//        for(Product p:listOfProducts) {
//            if(p.getWarranty()<warranty) {
//                listOfWarrantyLessThanGiven.add(p);
//            }
//        }
//        return listOfWarrantyLessThanGiven;
//    }

    public void show() {

    }
    @Autowired
    productDb db;
    public List<Product> getAllProducts() {
        return db.findAll();
    }
}
