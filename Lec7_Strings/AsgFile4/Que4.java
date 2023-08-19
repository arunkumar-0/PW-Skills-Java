//Que4 . Write a java program to remove particular character from the string

package Lec7_Strings.AsgFile4;

public class Que4 {
    public static void main(String[] args) {
        String str = "Arun Kumar";
        System.out.println(remove(str , 3));
    }
    public static String remove(String str , int pos){
        return str.substring(0, pos) + str.substring( pos + 1);
    }
}
