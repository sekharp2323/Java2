package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A9 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Alice","Bob","Charlie","David");
        Stream<String> stream=names.stream();

        List<String> filteredNames=names.stream()
                .filter(name->name.startsWith("B"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        filteredNames.forEach(System.out::println);
    }
}
