package org.example;

import java.lang.Runnable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Runnable r=()->System.out.println("Hello World!!!");
        r.run();
        BiFunction<Integer, Integer, Integer> add=(a,b)->a+b;
        System.out.println("Sum: "+add.apply(5,4));
        Function<String,Integer> length=str->str.length();
        System.out.println("length: "+length.apply("lambda"));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        Predicate<Integer> isEven=number->number%2==0;
        System.out.println("Is "+num+" is even? "+isEven.test(num));
    }
}