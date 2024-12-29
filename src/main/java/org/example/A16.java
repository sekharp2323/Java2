package org.example;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A16 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("example.txt");
        if(file.delete()){
            System.out.println("Deleted the file: "+file.getName());
        }else {
            System.out.println(" Failed to delete the file.");
        }
    }
}
