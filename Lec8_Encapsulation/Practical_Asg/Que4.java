//4.Write a program to call a method without creating an object of a class.

package Practical_Asg;

class Demo2 {

    static int age;

    static int set(int n) {
        age = n;
        return age;
    }

    static void display() {
        System.out.println("your age is " + age);

    }

}

public class Que4 {
    public static void main(String[] args) {
        Demo2.set(23);
        Demo2.display();
    }
}
