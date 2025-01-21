package com.omar.homework.codeAlong;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository<T>{
    private List<T> products = new ArrayList<>();

    public void addProduct(T product){
        products.add(product);
    }

    public void removeProduct(T product){
        products.remove(product);
    }

    public List<T> getAllProducts(){
        return products;
    }
}
