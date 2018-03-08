package TheLab;
import java.util.Arrays;


public class extraLab1 {
   
    public static void main(String[] args) {
        int[] arr = new int[100];

        for(int i=0; i<arr.length; i++)
            arr[i] = (int)(Math.random()*10);
        
        int randomNumber = (int)(Math.random()*20);
        System.out.println("Random number: " + randomNumber);
        System.out.println();

        int counter_index = 0;  //number of indexes where the randomNumber is in the array
        for( int i=0; i<arr.length; i++){
            if( arr[i] == randomNumber ){
                counter_index++;
                if(counter_index == 1 ){ System.out.print("Index: "); }
                System.out.print(i + " ");
            }
        }
        if(counter_index == 0 ){
            System.out.print("NO");
        }
        System.out.println();
        System.out.println("Sorted Array: ");
        sortArray(arr);
        printArray(arr);
    }
    
    public static void sortArray( int[] arr ){
        Arrays.sort(arr);
    }
    public static void printArray( int[] arr ){
        int i=0;
        for( int e : arr ){
            System.out.println("arr[" + i + "]: " + e );
            i++;
        }
    }
}
