package Lec15_Array.Array2D;

//Q2: write a program to print the elements above the secondary diagonal in a user inputted
// square matrix.
public class Que2 {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 10, 17 },
                { 4, 5, 6, 11, 18 },
                { 7, 8, 9, 12, 20 },
                { 13, 14, 15, 16, 19 },
                { 21, 22, 23, 25, 25 }
        };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < n - 1 || j == 0 && i < n - 1 || i + j < n - 1) {
                    System.out.println(arr[i][j]);
                }

            }
        }

    }
}
