package Lec16_Recursion;

//Q4 : Find the sum of the values of the array [92, 23, 15, -20, 10].
public class Que4 {

    public static int sum(int arr[], int n) {

        if (n <= 0) {
            return arr[n];
        }
        return arr[n] + sum(arr, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 92, 23, 15, -20, 10 };
        int n = arr.length - 1;
        System.out.println("the sum of the array is : " + sum(arr, n));

    }
}
