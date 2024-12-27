package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        String filename = "C:\\Users\\sekha\\Downloads\\Java2\\src\\main\\java\\org\\example\\Example23.txt";


        try{
            File file=new File(filename);
            Scanner sc=new Scanner(file);
            while (sc.hasNextLine()){
               String line= sc.nextLine();
               System.out.println(line);
            }
        } catch (FileNotFoundException e) {
           // throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
}
