package pl.sdacademy.shop.src.main.java.lambdy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeselList {
    private List<String> pesel = new ArrayList<>();

    public Collection<User> getValidUser(Collection<String> pesel) {
        return pesel.stream()
                .filter(p -> p.length() == 11)
                .map(User::new)
                .collect(Collectors.toList());


    }


}
