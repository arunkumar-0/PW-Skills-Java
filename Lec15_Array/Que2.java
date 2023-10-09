package Lec15_Array;

//Q2: Write a program to traverse over the elements of the array using for each loop and print all even
// elements.
public class Que2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int n : arr) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
}
