//Que1 . Write a Java Program to Reverse a String without using the inbuilt method

package Lec7_Strings.AsgFile4;

public class Que1 {
    public static void main(String[] args) {
        String name = "ARUN";
        String reversedName = "";
        for(int i = name.length() -1 ; i>=0 ; i--){
            char reverseName = name.charAt(i);
            reversedName = reversedName + reverseName;
        }
        System.out.println(reversedName);

    }
}
