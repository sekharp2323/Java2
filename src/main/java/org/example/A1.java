package org.example;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numerator: ");
        int numer=sc.nextInt();
        System.out.println("Enter the denominator: ");
        int denom=sc.nextInt();
        try {
            int result=numer/denom;
            System.out.println("Result: "+result);
        }
        catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
