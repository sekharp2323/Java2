package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AL {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(0,5,10,15,20,24,28,30,35,40,45,50,55,60,65,70,75,80,85,90,96,100);
        Predicate<Integer> isLessThanOrEqualTo50=number->number<=50;

        Function<Integer, Integer> multiplyByTwo=number->number*2;

        Consumer<Integer> printInteger= number->System.out.println("Processed Number: "+number);

        List<Integer> filterednums= integers.stream()
                .filter(isLessThanOrEqualTo50)
                .map(multiplyByTwo)
                .collect(Collectors.toList());

        filterednums.forEach(printInteger);
    }

}
