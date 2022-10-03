package com.example.operator;

import java.util.Scanner;

public class NameCommandLine {
    public static void main(String[] args){
        System.out.println("enter the Name \n\n");
        Scanner input = new Scanner(System.in);

        String str1 = input.nextLine();

        System.out.println(str1);
    }
}
