package pl.sdacademy.shop.src.main.java.shop;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductService {
    private final ShopDao dao;

    public ProductService(ShopDao dao) {
        this.dao = dao;
    }

    public Collection<Product> getAllProducts() {
        return dao.getCategoryList().stream()
                .map(Category::getProductList)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }

    private void deleteProduct(Predicate<Product> p) {
        dao.getCategoryList().forEach(c -> c.getProductList().removeIf(p));
    }

    public void deleteProductByName(String name) {
        deleteProduct(p -> p.getName().equals(name));
    }

    public void deleteProductBySerial(int serial) {
        deleteProduct(p -> p.getSerial() == serial);
    }

    private Product findProduct(Predicate<Product> predicate){
        return getAllProducts().stream()
                .filter(predicate)
                .findFirst().get();
    }

    public Product findProductByName(String name) {
        return findProduct(p->p.getName().equals(name));
    }

    public Product findProductBySerial(int serial) {
        return findProduct(p->p.getSerial()==(serial));
    }

}
