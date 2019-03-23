package pl.sdacademy.shop.src.main.java;

import shop.*;

public class Main {
    public static void main(String[] args) {
        ShopDao dao = new ShopDao();
        ProductService productService=new ProductService(dao);
        CategoryService categoryService=new CategoryService(dao);
        new Gui(categoryService, productService).run();
    }
}
