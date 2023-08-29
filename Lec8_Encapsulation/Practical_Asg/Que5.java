//5.Write a program which has static block and constructor overloading,initialise variables using constructors and print it.

package Practical_Asg;

class Demo3 {
    int a;
    int b;

    public Demo3() {
        System.out.println("Unparameterized constructor");
    }

    public Demo3(int n, int m) {
        a = n;
        b = m;
    }

    public void show() {
        System.out.println("the value of variables is " + a + " " + b);
    }

    static int age;
    static {
        age = 23;

    }

    static void display() {
        System.out.println("your age is " + age);
    }
}

public class Que5 {
    public static void main(String[] args) {
        Demo3 obj = new Demo3();
        Demo3 obj1 = new Demo3(24, 12);
        obj1.show();
        Demo3.display();
    }
}
