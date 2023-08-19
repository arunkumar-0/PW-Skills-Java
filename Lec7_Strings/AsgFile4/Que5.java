//Que5 . Write a java program to find the index of a substring

package Lec7_Strings.AsgFile4;

public class Que5 {
    public static void main(String[] args) {
        String idx = "PW SKILLS ";
        int intIndex = idx.indexOf("SKILLS");
	      
        if(intIndex == - 1) {
           System.out.println("Not found");
        } else {
           System.out.println("Found at index " + intIndex);
        }
    }
}
