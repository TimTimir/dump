package org.flomintv.stream.api;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        stream = Stream.of("a", "b", "c");

        List<String> list = new ArrayList<>();
        list.add("qwerty");
        list.add("asdf");
        list.add("wasd");
        list.add("wasd");
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");
        Stream<String> listStream = list.stream();
        list.parallelStream().forEach(Main::doWork);
        long count = list.stream().distinct().count();
        System.out.println("distinct count: " + count);

        // this code...
        for (String string : list) {
            if (string.contains("a")) {
                System.out.println("Contains 'a'!");
            }
        }

        // can be replaced with this code:
        boolean isExist = list.stream().anyMatch(element -> element.contains("a"));
        if (isExist) {
            System.out.println("Contains 'a'!!!");
        }

        boolean isValid = list.stream().anyMatch(element -> element.contains("h")); // true
        boolean isValidOne = list.stream().allMatch(element -> element.contains("h")); // false
        boolean isValidTwo = list.stream().noneMatch(element -> element.contains("h")); // false
        System.out.println("isValid: " + isValid);
        System.out.println("isValidOne: " + isValidOne);
        System.out.println("isValidTwo: " + isValidTwo);

        Stream<String> dStream = list.stream().filter(element -> element.contains("d"));
        System.out.println("dStream count: " + dStream.distinct().count());

        List<String> uris = new ArrayList<>();
        uris.add("C:\\My.txt");
        Stream<Path> pathStream = uris.stream().map(uri -> Paths.get(uri));

        List<Integer> integers = Arrays.asList(1, 1, 1);
        Integer reduced = integers.stream().reduce(23, (a, b) -> a + b);

        List<String> resultList = list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    private static void doWork(String element) {
        System.out.println(element);
    }

}
