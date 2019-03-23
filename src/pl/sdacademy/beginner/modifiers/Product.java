package pl.sdacademy.beginner.modifiers;

public class Product {
    private static final double VAT = 1.23;
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Double getNetPrice() {
        return price;
    }

    public Double getGrossPrice() {
        return price * VAT;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
