package Lec15_Array.Array2D;

//Q4: Write a program to find the largest element of a given 2D array of integers.
public class Que4 {
    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 19, 12 },
                { 13, 14, 15, 1 } };
        int n = arr.length;
        int max = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

        }
        System.out.println(max);
    }
}
