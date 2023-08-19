//Que3 reverse "Think Twice" while preserving the position


public class Que3 {
    public static void main(String[] args) {
        String input = "Think Twice";
        String output = reversedString(input);
        System.out.println(output);
        
    };
    public static String reversedString(String input){
        String[] words = input.split(" ") ;
        StringBuilder result = new StringBuilder();

        for(String word : words ){
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();
    }

}
