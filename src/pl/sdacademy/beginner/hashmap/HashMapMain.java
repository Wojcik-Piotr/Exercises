package pl.sdacademy.beginner.hashmap;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapMain {

    public static void main(String[] args) {
        Map<Long, String> userToName = new HashMap<>();
        userToName.put(1L, "John");
        userToName.put(2L, "Other");
        userToName.put(3L, "Other");

        HashSet<String> set = new HashSet();

        for (String o : set) {

        }

        for(Long key : userToName.keySet()){
            System.out.println(key);
            System.out.println(userToName.get(key));
        }

        for (String value : userToName.values()) {
            System.out.println(value);
        }

        for(Map.Entry<Long, String> entry : userToName.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


        System.out.println(userToName.get(1l));
    }
}
