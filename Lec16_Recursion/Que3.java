package Lec16_Recursion;

import java.util.Scanner;

//Q3: Print the max value of the array [ 13, 1, -3, 22, 5].
public class Que3 {
    public static int max(int arr[], int lt, int idx) {
        if (idx == lt - 1) {
            return arr[lt - 1];
        }
        int later = max(arr, lt, idx + 1);
        int maxval = Math.max(arr[idx], later);
        return maxval;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int lt = arr.length;
        System.out.println("the max value is : " + max(arr, lt, 0));
        sc.close();
    }
}