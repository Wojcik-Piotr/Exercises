package pl.sdacademy.beginner.hashcode.product;

import java.util.HashSet;
import java.util.Set;

public class ProductDao {

    private Set<Product> products = new HashSet<>();

    public void add(Product p){
        products.add(p);
    }

    public Set<Product> getAll(){
        return products;
    }
}
