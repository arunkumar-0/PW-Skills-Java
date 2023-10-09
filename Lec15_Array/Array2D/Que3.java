package Lec15_Array.Array2D;

//Q3: write a program to print the elements of both the diagonals in a user inputted square matrix
// in any order.
public class Que3 {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
