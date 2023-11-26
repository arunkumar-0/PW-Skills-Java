package Lec16_Recursion;

import java.util.Scanner;

//Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
// That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
public class Que2 {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 0) {
            return sum(n - 1) - n;
        } else {
            return sum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("the alternate sum of the n is : " + result);
        sc.close();
    }
}
