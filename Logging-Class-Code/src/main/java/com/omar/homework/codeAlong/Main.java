package com.omar.homework.codeAlong;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age",25);
        System.out.println(pair); // Output: (Age, 25)

        ProductRepository<Product> repository = new ProductRepository<>();
        repository.addProduct(new Product(1, "Laptop"));
        repository.addProduct(new Product(2, "Phone"));

        System.out.println(repository.getAllProducts());

    }
    public static void printList(List<?> list){
        for(Object item : list){
            System.out.println(item);
        }
    }
}
