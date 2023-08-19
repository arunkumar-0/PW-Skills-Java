//Que4. WAP to sort a string Alphabetically

import java.util.Arrays;

public class Que4 {
    public static void main (String[] args){
        String input = "ARUN";
        char[] chars = input.toCharArray();

        Arrays.sort(chars);
        String sortedString = new String(chars);
        System.out.println(sortedString);
    }

}
