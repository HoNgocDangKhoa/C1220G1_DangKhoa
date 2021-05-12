package com.example.repository.impl;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    public static Map<Integer, Product> productMap = new HashMap<>();

    static {
        productMap.put(1, new Product(1, "Iphone", 200, "Iphone"));
        productMap.put(2, new Product(2, "SamSung", 300, "Samsung"));
        productMap.put(3, new Product(3, "Nokia", 400, "Cuc Gach"));
        productMap.put(4, new Product(4, "Lumia Note8", 600, "Trang Den"));
        productMap.put(5, new Product(5, "Iphone 12 Pro", 700, "Iphone"));
    }

    @Override
    public List<Product> findAll() {

        return new ArrayList<>(productMap.values());
    }

    @Override
    public void saveProduct(Product product) {
        productMap.put(product.getId(), product);

    }

    @Override
    public void updateProduct(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void deleteProduct(int id) {
        productMap.remove(id);
    }

    @Override
    public Product findById(int id) {

        return productMap.get(id);
    }
}
