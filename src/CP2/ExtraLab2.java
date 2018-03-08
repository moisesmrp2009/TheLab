//Student: Moises Rivas     Student ID: 1809547

//Write a program that randomly fills in 0 and 1s into a 4-by-4 matrix, print the matrix, and finds the row
//and column with the most 1s.
package CP2;

public class ExtraLab2 {
    
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        
        for( int i=0; i<arr.length; i++){ //fill array with 1s and 0s
            for( int j=0; j<arr[i].length; j++ ){
                arr[i][j] = (int)(Math.random()*2);
            }
        }
        printIntArray_2Dim(arr); //print array

        //....> FINDING THE GREATEST ROW WITH 1s <....//
        int max_sumrow=0;
        int at_row=0;
        for( int i=0; i<arr.length; i++ ){ 
            if( sumRow(i,arr)>max_sumrow ){
                max_sumrow = sumRow(i,arr); 
                at_row = i;
            }
        }
        System.out.println("The row with the most 1s is: " + at_row );
        
        //....> FINDING THE GREATEST COLUMN WITH 1s <....//
        int max_sum_columns=0;
        int at_column=0;
        for( int column=0; column<arr[0].length; column++ ){ 
            if( sumColumn(column, arr) > max_sum_columns ){
                max_sum_columns = sumColumn(column, arr);
                at_column = column;
            }
        }
        System.out.println("The column with the most 1s is " + at_column );
        
        
        
    }
    public static int sumRow( int row, int[][] arr ){
        int sum=0;
        for( int column=0; column<arr.length; column++ ){ //add all at specified row
            sum += arr[row][column];
        }
        return sum;
    }
    public static int sumColumn( int column, int[][] arr ){
        int sum=0;
        for( int row=0; row<arr.length; row++ ){
            sum += arr[row][column];
        }
        return sum;
    }
    public static void printIntArray_2Dim( int[][] arr ){
        for( int i=0; i<arr.length; i++ ){
            for( int j=0; j<arr[i].length; j++ ){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
