package Lec16_Recursion;

import java.util.Scanner;

// Q1 : Given an integer, find out the sum of its digits using recursion..

public class Que1 {
    public static int findsum(int n) {
        int ans = 0;
        if (n == 0) {
            return 0;
        } else {
            ans = n % 10 + findsum(n / 10);
            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int result = findsum(n);
        System.out.println("the sum of the digits is: " + result);
        sc.close();
    }
}