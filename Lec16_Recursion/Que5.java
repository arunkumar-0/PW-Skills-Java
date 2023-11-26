package Lec16_Recursion;

//Q5. Given a number n. Print if it is an armstrong number or not.
public class Que5 {

    public static void main(String[] args) {
        int n = 153;
        int dig = 0;
        int temp = n;
        while (temp > 0) {
            dig++;
            temp /= 10;
        }
        if (n == numCount(n, dig))
            System.out.println("armstrong number");
        else
            System.out.println("not an armstrong number");
    }

    public static int power(int a, int b) {
        int result, finalresult;
        if (b == 1)
            return a;
        else
            result = power(a, b / 2);
        finalresult = result * result;

        if (b % 2 == 0)
            return finalresult;
        else
            return result * finalresult;

    }

    public static int numCount(int n, int dig) {
        if (n == 0)
            return 0;

        return power(n % 10, dig) + numCount(n / 10, dig);

    }
}
