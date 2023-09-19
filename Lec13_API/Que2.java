package Lec13_API;

import java.time.*;

// 2. Write a program to convert a date to a string in the format "MM/dd/yyyy".
public class Que2 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();

        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        int year = ld.getYear();
        System.out.println(month + "/" + day + "/" + year);

    }
}
