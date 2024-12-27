package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> numbers= IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> result=numbers.stream()
                .filter(num ->num>3)
                .map(num->num*num)
                .sorted((a,b)->b-a)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}

