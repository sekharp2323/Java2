package org.example;

import java.lang.Runnable;

public class Human  implements Runnable,Walk {
@Override
    public void run(){
    System.out.println("Humans run at max 30km/ph");
}
@Override
    public void walk(){
    System.out.println("Humans walk at max 10km/ph");
}
}
