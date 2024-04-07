package com.ritika;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter two numbers: ");

        int a = in.nextInt();
        int b = in.nextInt();
         if (a > b) {
             System.out.println(a + " is the largest.");
         }
         else {
             System.out.println(b + " is the largest.");
         }


    }
}
