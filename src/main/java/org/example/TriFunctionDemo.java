package org.example;

public class TriFunctionDemo {
    public static void main(String[] args) {
        TriFunction<Integer,Integer,Integer> CalculateArea =(l,w)->l*w;
        System.out.println("The volume of box1 is ; "+ CalculateArea.cal(4,5));
    }
}
