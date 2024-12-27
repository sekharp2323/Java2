package org.example;

public class A5 {
    public static void main(String[] args) {
        String str=null;

        try{
            int length=str.length();
            System.out.println("Length of the string is: " + length);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
