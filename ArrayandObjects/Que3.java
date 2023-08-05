//Q3. wrtie a java program to calculate sum of all all elements in an integer array

package ArrayandObjects;

public class Que3 {
    public static void main(String[] args) {
        int arr[] = {2 , 5 , 9, 12};
        System.out.println(arr.length);
        int ans = 0 ;
        for(int n : arr){
             ans = n + ans;
                         
        }
        System.out.println(ans);
        
         
    }
    
}
