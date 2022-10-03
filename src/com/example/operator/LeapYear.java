package com.example.operator;

import java.util.Scanner;
    public class LeapYear {
        public static void main(String[] args){
            int y;
            System.out.println("Enter an Year :: ");
            Scanner sc = new Scanner(System.in);
            y = sc.nextInt();

            if (((y % 4 == 0) && (y % 100!= 0)) || (y%400 == 0))
                System.out.println("year is a leap year");
            else
                System.out.println("year is not a leap year");
        }
    }
