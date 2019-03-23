package pl.sdacademy.shop.src.main.java.shop;

import java.util.List;

public class Category {
    private String name;
    private List<Product> productList;

    public Category(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void remuveProduct(Product product) {
        productList.remove(product);
    }

     public List<Product> getProductList() {
        return productList;
    }

    public String getName() {
        return name;
    }
}
