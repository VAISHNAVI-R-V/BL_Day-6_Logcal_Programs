package com.bl.day6;

import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {

        int n, n1 = 0, n2 = 1, n3;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter valye of n:");
        n = s.nextInt();
        System.out.println("Fabonacci Series");

        int i = 0;
        // condition for fabonacci series
        while(i < n ) {
            if( i <= 1)
                n3 = i;
            else {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            System.out.print("\n"+n3);
            i++;
        }
    }
}
