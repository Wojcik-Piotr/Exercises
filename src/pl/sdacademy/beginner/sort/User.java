package pl.sdacademy.beginner.sort;

public class User implements Comparable<User>{
    private String name;

    private String hairColor;

    private Integer height;

    public User(String name, String hairColor, Integer height) {
        this.name = name;
        this.hairColor = hairColor;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public int compareTo(User o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", height=" + height +
                '}';
    }
}
