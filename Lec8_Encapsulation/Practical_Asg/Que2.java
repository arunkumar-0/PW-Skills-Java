//2.Write a program and create a constructor with parameters and initialise the variable using a constructor.

package Practical_Asg;

class Cnstr {
    int n;
    int m;

    public Cnstr(int a, int b) {
        n = a;
        m = b;

    }

    void display() {
        System.out.println("the value of a and b is :" + n + " " + m);
    }
}

public class Que2 {
    public static void main(String[] args) {
        Cnstr obj = new Cnstr(12, 67);
        obj.display();
    }
}
