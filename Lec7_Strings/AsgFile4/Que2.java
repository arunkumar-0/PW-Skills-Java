//Que2 . Write a java program to know weather the given string is palindrome

package Lec7_Strings.AsgFile4;
import java.util.*;

public class Que2 {
    
    public static void main(String[] args) {
        String  rev = "";
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Input");
       String name = sc.next();
       for (int i = name.length() - 1  ; i >=0 ; i--){
        rev = rev + name.charAt(i); 
        
       }if (name.equals(rev)){
            System.out.println("string are palindrome");
        }else {
            System.out.println("string are not palandrome");
        }
    }
}
