package Lec15_Array;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Enter the numbers");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
