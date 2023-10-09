package Lec15_Array;

//Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than
// its just left and just right neighbor.
public class Que5 {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 7, 3, 2, 6, 5 };
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
