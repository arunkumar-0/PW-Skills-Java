//Q4. write a java program to find index of a specific program

package ArrayandObjects;

public class Que4 {
    public static int index(int arr[], int no){
        int i=0;
        for( i = 0 ; i<arr.length ;i++){
            if(no == arr[i]){
                return i;
            }
        }
        return 0;
        
    }
    public static void main(String[] args) {
       int arr[] = {1 , 45, 6 , 23 ,9 };
        
       System.out.println("the index is" + index(arr, 6) );
        }
        
    }
    
