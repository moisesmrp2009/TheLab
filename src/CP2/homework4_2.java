package CP2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class homework4_2 {
    public static void main(String[] args) {
        System.out.println("Enter two number to be added: ");
        int input_1=0;
        while(true){
            try{
                System.out.print("First number: ");
                input_1 = new Scanner(System.in).nextInt();
            }catch(InputMismatchException e){
                System.err.println("YOU ENTERED AN INVALID INPUT");
                System.err.println("TRY AGAIN:\n");
                continue;
            }
            break;
        }
        
        int input_2=0;
        while(true){
            try{
                System.out.print("Second Number: ");
                input_2 = new Scanner(System.in).nextInt();
            }catch(InputMismatchException e){
                System.err.println("YOU ENTERED AN INVALID INPUT");
                System.err.println("TRY AGAIN:\n");
                continue;
            }
            break;
        }
        System.out.println("the sum is: " + (input_1+input_2) );
    }
}
