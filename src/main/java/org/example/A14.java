package org.example;

import java.io.File;
import java.io.IOException;

public class A14 {
    public static void main(String[] args) {
        File file=new File("example.txt");
        try {
            if(file.createNewFile()){
                System.out.println("File Created: "+file.getName());
            }
            else {
                System.out.println("File already exists");
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
