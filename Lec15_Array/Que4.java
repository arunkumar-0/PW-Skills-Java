package Lec15_Array;

//Q4: Write a program to find out the second largest element in a given array.
public class Que4 {
    public static void main(String[] args) {
        int arr[] = { 34, 21, 54, 65, 99, 1000, 12, 1 };
        int max = arr[0];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                j = i;
            }
        }
        if (j == 0) {
            max = arr[1];
        } else {
            max = arr[0];
        }
        for (int k = 0; k < arr.length; k++) {
            if (k != j) {
                if (arr[k] > max) {
                    max = arr[k];
                }
            }
        }
        System.out.println(max);

    }
}
