package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A17 {
    public static void main(String[] args) throws IOException {
        FileWriter writer=new FileWriter("example.txt",true);
        writer.append("nuvve Adding more lines");
        writer.close();
        System.out.println("Data appended successfully");
    }
}
