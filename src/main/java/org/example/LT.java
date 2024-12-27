package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LT {
    public static void main(String[] args) {
        LocalDate lt=LocalDate.now();
        System.out.println(lt);
        LocalTime ld=LocalTime.now();
        System.out.println(ld);
        LocalDateTime ltd=LocalDateTime.now();
        System.out.println(ltd);
    }
}
