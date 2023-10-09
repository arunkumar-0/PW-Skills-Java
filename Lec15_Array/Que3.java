package Lec15_Array;

//Q3: Write a program to calculate the maximum element in the array.
public class Que3 {
    public static void main(String[] args) throws Exception {

        int arr[] = { -6, 7, 80, 10, 1, 3, };
        int max = arr[0];

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
