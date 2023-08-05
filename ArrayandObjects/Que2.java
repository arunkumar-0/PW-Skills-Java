//Q2. Write a prorgam to create an Object of an class which contain a method and call that class method in main method 

package ArrayandObjects;
class Calulate {
    int multiply (int n1 , int n2 , int n3){
        int ans = n1*n2*n3;
        return ans;
    }
}
public class Que2 {
    public static void main(String[] args) {
        Calulate obj = new Calulate();
        System.out.println(obj.multiply(3, 4, 5));
    }
}
