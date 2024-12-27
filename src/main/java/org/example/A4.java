package org.example;

public class A4 {
    public static void main(String[] args) {
        int[] numbers=new int[5];
        try{
            for(int i=0;i<numbers.length;i++){
                numbers[i]=i*10;
            }
            for(int i=0;i<numbers.length;i++){
                System.out.println("Number " + numbers[i]);
            }
            System.out.println(numbers[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
