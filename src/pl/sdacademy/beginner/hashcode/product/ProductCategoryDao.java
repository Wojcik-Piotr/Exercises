package pl.sdacademy.beginner.hashcode.product;

import java.util.*;

public class ProductCategoryDao {

    private Map<Category, List<Product>> categoryToProducts = new HashMap<>();

    public void add(Product p) {
        categoryToProducts.putIfAbsent(p.getCategory(), new ArrayList<>());
        List<Product> products = categoryToProducts.get(p.getCategory());
        products.add(p);
    }

    public List<Product> findByCategory(Category category){
        List<Product> products = categoryToProducts.get(category);
        return products;
    }

    public Set<Product> getAll(){
        Set<Product> all = new HashSet<>();
        Collection<List<Product>> values = categoryToProducts.values();

        for (List<Product> products: values) {
            for (Product product : products) {
                all.add(product);
            }
        }
        return all;
    }
}
