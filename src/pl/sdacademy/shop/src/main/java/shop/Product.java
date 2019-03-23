package pl.sdacademy.shop.src.main.java.shop;

public class Product {
    private String name;
    private int serial;

    public Product(String name, String serial) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSerial() {
        return serial;
    }
}
