package pl.sdacademy.beginner.hashcode;

import java.util.Map;

public class User {

    private String email;

    public User(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        return email.equals(((User) o).email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }

    public <K,V> V getFromMap(Map<K, V>map, K key){
             return map.get(key);
    }







}



