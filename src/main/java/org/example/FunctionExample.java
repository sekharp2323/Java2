package org.example;

import java.util.function.*;

public class FunctionExample {
    public static void main(String[] args) {
        Greeting greet=name -> System.out.println("Hello "+ name);
        greet.SayHello("Sekhar");

        Function<Integer,Integer> square=x->x*x;
        System.out.println(square.apply(7));

        BiFunction<Integer, Double, Double> add=(a,b)->a+b;
        System.out.println(add.apply(3,4.55));

        Consumer<String> prem=s->System.out.println(s);
        prem.accept("Hello Prem!!!mannnn");

        Predicate<Integer> isodd=s->s%2!=0;
        System.out.println(isodd.test(6));

        Supplier<Double> random=()->Math.random();
        System.out.println(random.get());
    }
}

@FunctionalInterface
interface Greeting{
    void SayHello(String name);
}