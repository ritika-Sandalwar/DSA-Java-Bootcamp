package com.ritika;
import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        num1 = sc.nextInt();

        num2 = sc.nextInt();

        for (int i = num1; i<num2; i++){
            int check, rem, sum = 0;
            check = i;
            while(check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if(sum == i){
                System.out.println(" "+i+" is an Armstrong number.");
            }
        }
    }
}
