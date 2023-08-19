//Writa a java program to convert uppercase to lower caseand vice versa

package Lec7_Strings.AsgFile4;
import java.util.*;

public class Que3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the sentence to change case");
      String str = sc.nextLine();
      String str1 = " ";
      for(int i = 0 ; i <= str.length() - 1 ; i++){
        if((str.charAt(i)>= 'a') && (str.charAt(i) <= 'z')){
          str1 = str1 + (char) (str.charAt(i) - 32);
        }else if 
          ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')){
            str1 = str1 + (char) (str1.charAt(i) + 32);
          }
        
        
      }
      System.out.println(str1);
    }
}
