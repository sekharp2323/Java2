package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class A15 {
    public static void main(String[] args) throws IOException {
        FileWriter writer=new FileWriter("example.txt");
        writer.write("Hello, this is a test file. \nAdding more lines.\nPachuru Chandra Sekhar");
        writer.close();
        System.out.println("Successfully wrote o the file");
    }
}
