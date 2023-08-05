//Q1. Write a program to demonstrate method overloading with 3 different parameters

package ArrayandObjects;

class Calc {
    public int add (int a1 , int a2 , int a3 ){
        int res = a1 + a2 +a3;
        return res;
    }
    public double add (double n1 , double n2 , double n3){
        double res = n1 + n2 + n3 ;
        return res;
    }

    public String add (String s1 , String s2 , String s3){
        String res = s1 +s2 +s3;
        return res;
    }
}

public class Que1 {
    public static void main(String[] args) {
        Calc obj = new Calc();
       int ans = obj.add(15, 45, 16);

       double ans2 = obj.add(2.45, 23.6, 12.9);
       String ans3 = obj.add("ar" , "un" , " kumar");

       System.out.println(ans);
       System.out.println(ans2);
       System.out.println(ans3);
    }
    
}
