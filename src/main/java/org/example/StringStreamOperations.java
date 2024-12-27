package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringStreamOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a List of Strings seperated by spaces");
        String input=scanner.nextLine();

        String result= Arrays.stream(input.split("\\s+"))
                .filter(str->str.length()>3)
                .collect(Collectors.joining(", "));

        System.out.println("Resulting String: "+result);
        scanner.close();
    }
}
