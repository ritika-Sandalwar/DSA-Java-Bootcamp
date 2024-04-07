package com.ritika;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = in.next();

        System.out.println(" Hey!! " + name);
        System.out.println(" How you doin' ??");
    }
}
