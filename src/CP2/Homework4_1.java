package CP2;

import java.util.InputMismatchException;
import java.util.Scanner;

class Homework4_1 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for(int i=0;i<100;i++){ //filling the arr
            arr[i] = (int)(Math.random()*100);
        }
        displayArr(arr);
        try{
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an index to research in the array");
            int input = scanner.nextInt();
            System.out.println("The number stored at that position is: ");
            System.out.println(arr[input]);
            
        }catch( InputMismatchException ae){
            System.err.println("YOU ENTERED A WRONG INPUT");
            System.err.println(ae);
        }catch( ArrayIndexOutOfBoundsException ae){
            System.err.println("YOU ENTERED A A WRONG INPUT");
            System.err.println(ae);
        }
                
    }
    public static void displayArr(int[] arr) {
        for(int i=0;i<arr.length;i++){ //displaying arr
            System.out.println(i + ": " + arr[i]);
        }
    }
}
