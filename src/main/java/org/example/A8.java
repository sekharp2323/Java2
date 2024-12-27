package org.example;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class A8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        Predicate<Integer> iseven=x->x%2==0;
        System.out.println(a+" is a even? "+iseven.test(a));
        Function<String,Integer> lengthFunction=str->str.length();
        System.out.println(lengthFunction.apply("Helloing"));
    }
}
