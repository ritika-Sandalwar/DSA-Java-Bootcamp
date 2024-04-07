package com.ritika;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter principal number: ");
        float p = in.nextFloat();

        System.out.println("Enter interest rate: ");
        float r = in.nextFloat();

        System.out.println("Enter time period in years: ");
        float t = in.nextFloat();
        float si;
        si = ( p * t * r )/100;
        System.out.println(si);
    }
}
