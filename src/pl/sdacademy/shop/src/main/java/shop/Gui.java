package pl.sdacademy.shop.src.main.java.shop;

public class Gui implements Runnable {
    private final CategoryService categoryService;
    private final ProductService productService;

    public Gui(CategoryService categoryService, ProductService productService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }


    @Override
    public void run() {

    }
}
