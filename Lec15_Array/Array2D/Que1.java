package Lec15_Array.Array2D;
//Q1: Take m and n input from the user and m * n integer inputs from user and print the following:

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int n = sc.nextInt();

        System.out.println("Enter no. of columns ");
        int m = sc.nextInt();

        System.out.println("Enter the elements");
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int positive, negative, odd, even, zero;
        positive = negative = odd = even = zero = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > 0) {

                    positive += 1;
                }
                if (arr[i][j] < 0) {

                    negative += 1;
                }
                if (arr[i][j] == 0) {

                    zero += 1;

                }
                if (arr[i][j] % 2 == 0) {

                    even += 1;
                }
                if (arr[i][j] % 2 != 0) {

                    odd += 1;
                }

            }
        }
        System.out.println(
                "positive elements: " + positive + "\n negative elements: " + negative + "\n zero: " + zero
                        + "\n even elements: "
                        + even
                        + "\n odd elements: " + odd);
        sc.close();
    }
}
