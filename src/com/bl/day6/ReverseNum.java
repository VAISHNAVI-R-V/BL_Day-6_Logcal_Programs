package com.bl.day6;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter A number");
        int num = s.nextInt();

        //prints reverse number
        int reverse = reverseNum(num);
        System.out.println("Reverse number is: " +reverse);
    }
    private static int reverseNum(int num) {
        int rem; // reminder
        int rev = 0; // reverse
        int temp = num;

        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        return rev;
    }
}
