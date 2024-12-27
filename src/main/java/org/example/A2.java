package org.example;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        String a=sc.nextLine();
        try{
            int number=Integer.parseInt(a);
            System.out.println("You Entered a number: "+number);
        }
        catch (NumberFormatException e){
            System.out.println("NumberFormatException: Invalid input. Please enter a valid number.");

        }
        finally {
            sc.close();
        }
    }
}
