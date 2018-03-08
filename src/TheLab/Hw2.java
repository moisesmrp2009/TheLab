//Moises Rivas      Student ID: 1809547
package TheLab;
import java.util.Random;

class Hw2 {
    
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        Random random = new Random();


        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = random.nextInt(1001);
            }
        }
        
        //print arr
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print( arr[i][j] + "\t");
            }
            System.out.println();
        }
        //-------------------------------------------
        //finding the first and second
        int num_1ST, num_2ND;
        int max_1ST=0, max_2ND=0;
        int abs_max_1ST=0, abs_max_2ND=0;
        
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length-1;){
                num_1ST = arr[i][j];
                num_2ND = arr[i][++j];
               
                //finding the greatest from two numbers
               if(num_1ST > num_2ND){
                    max_1ST = num_1ST;
                    max_2ND = num_2ND;
                }
                else {
                    max_1ST = num_2ND;
                    max_2ND = num_1ST;
                }
                
                //finding the greatest from the previous numbers
                if( max_1ST > abs_max_1ST ){
                    if(abs_max_1ST>abs_max_2ND){
                        abs_max_2ND = abs_max_1ST;
                    }
                    abs_max_1ST = max_1ST;
                }
                else if( max_1ST < abs_max_1ST && max_1ST > abs_max_2ND){
                        abs_max_2ND = max_1ST;
                }
                if(max_2ND > abs_max_2ND){
                    abs_max_2ND = max_2ND;
                }
            }
        }
        
        System.out.println("first maximum number : " + abs_max_1ST);
        System.out.println("second maximum number : " + abs_max_2ND);
        
    }
}
