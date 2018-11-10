package org.flomintv.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Optional<List<Integer>> listOptional = Optional.ofNullable(getIntList());
            System.out.println(listOptional.orElseGet(ArrayList::new));
        }
    }

    private static List<Integer> getIntList() {
        Random r = new Random();
        if (r.nextInt() % 2 == 0) {
            return new ArrayList<>();
        } else {
            return null;
        }
    }

}
