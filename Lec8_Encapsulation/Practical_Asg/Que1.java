//1.Create a class that keeps track of the number of instances created. Implement a static variable and method to accomplish this.

package Practical_Asg;

class Demo1 {
    static int count;

    Demo1() {
        count++;
    }

    static int count() {
        return count;
    }

}

public class Que1 {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        Demo1 obj1 = new Demo1();
        Demo1 obj2 = new Demo1();
        Demo1 obj3 = new Demo1();
        System.out.println(Demo1.count());

    }
}
