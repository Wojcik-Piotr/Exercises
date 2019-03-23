package pl.sdacademy.beginner.hashcode.product;

public class Category {

    private Long id;

    private String name;


    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (id != null ? !id.equals(category.id) : category.id != null) return false;
        return name != null ? name.equals(category.name) : category.name == null;
    }


    public static void main(String[] args) {
         Category c1 = new Category(1l, "name");
         Category c2 = new Category(1l, "name");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
