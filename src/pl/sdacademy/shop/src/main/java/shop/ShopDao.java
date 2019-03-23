package pl.sdacademy.shop.src.main.java.shop;

import java.util.ArrayList;
import java.util.List;

public class ShopDao {
    private List<Category> db = new ArrayList<>();

    void addCategory(Category category) {
        db.add(category);
    }

    void remuveCategory(Category category) {
        db.remove(category);
    }

    List<Category> getCategoryList() {
        return db;
    }


}

