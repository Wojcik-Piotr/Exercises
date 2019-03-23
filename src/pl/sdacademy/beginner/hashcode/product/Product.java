package pl.sdacademy.beginner.hashcode.product;

public class Product {

    private Long id;

    private String catalogueNumber;

    private Category category;

    private String name;

    private Long order;

    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != null ? !id.equals(product.id) : product.id != null) return false;
        return catalogueNumber.equals(product.catalogueNumber);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + catalogueNumber.hashCode();
        return result;
    }
}
