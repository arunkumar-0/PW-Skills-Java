//3.Use a private keyword for a variable and use setter and getter methods to initialise and print the values.

package Practical_Asg;

class Prvt {

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void display() {
        System.out.println("the value of A and B is " + a + " " + b);
    }
}

public class Que3 {
    public static void main(String[] args) {
        Prvt obj = new Prvt();

        obj.setA(13);
        obj.getA();

        obj.setB(40);
        obj.getB();

        obj.display();

    }
}
