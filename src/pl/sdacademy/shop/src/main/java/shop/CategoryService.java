package pl.sdacademy.shop.src.main.java.shop;

import java.util.Collection;

public class CategoryService {
    private final ShopDao dao;

    public CategoryService(ShopDao dao) {
        this.dao = dao;
    }

    public void addCategory(String name) {
        dao.addCategory(new Category(name));
    }

    public void deleteCategory(String name) {
        dao.getCategoryList().removeIf(category -> category.getName().equals(name));
    }

    public Collection<Category> getAllCategory() {
        return dao.getCategoryList();
    }

}
