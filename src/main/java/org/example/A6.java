package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=0;
        boolean validInput=false;
        while (!validInput){
            System.out.println("Enter an integer: ");
            try{
                number=sc.nextInt();
                validInput=true;
            }catch (InputMismatchException e){
                e.printStackTrace();
                sc.next();
            }
        }
        System.out.println("You Entered:"+number);
sc.close();}

}
