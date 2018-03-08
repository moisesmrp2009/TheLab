//Moises Rivas      Student ID: 1809547
package CP2;

import java.util.Scanner;
public class Tictactoe {

    public static void main(String[] args) {
//        data
        char[][] board = new char[ 3 ][ 3 ];
        char[] player = new char[ 2 ];
        boolean gameover = false;

//        set up game
            displayBoard( board );
            player[0] = askPlayers( 1 );
            player[1] = askPlayers( 2 );
            System.out.println( "Player 1 is: " + player[0] );
            System.out.println( "Player 2 is: " + player[1] );

        while(true){
            makeMove( player[0], board );
            displayBoard(board);
            gameover = checkBoard( board, player );
            if( gameover ){
                System.out.println("player "+ player[0]+ " WON ");
                break;
            }
            makeMove( player[1], board );
            displayBoard(board);
            gameover = checkBoard( board, player );
            if( gameover ){
                System.out.println("player "+ player[0]+ " WON ");
                break;
            }
        }
    }
    public static void displayBoard( char[][] board ){
        for( int i=0; i<board.length; i++ ){
            for( int j=0; j<board[i].length; j++ ){
                System.out.print( board[i][j]==0 ? "|  "+" ":"| "+board[i][j]+" ");
            }
            System.out.print("|");
            System.out.println();
            System.out.println("-------------");
        }
    }
    public static char askPlayers( int theplayer_number ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose player " + theplayer_number + ": X or Y ");
        return scanner.nextLine().charAt(0);
    }
    private static void makeMove( char player , char[][] board ) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Turn of "+ player +"\n" + "Choose row: "); int row = scanner.nextInt();
        System.out.println("Choose column: "); int column = scanner.nextInt();
        board[row][column] = player;
    }
    private static boolean checkBoard( char[][] board, char[] player ) {
        if( //....> check 1 <....
            board[0][0]==player[0] && board[0][1]==player[0] && board[0][2]==player[0]
        ||  board[0][2]==player[1] && board[0][1]==player[1] && board[0][0]==player[1]
        ){
            return true;
        }
        if(
            board[0][0]==player[0] && board[1][0]==player[0] && board[2][0]==player[0]  
        ||  board[2][0]==player[1] && board[1][0]==player[1] && board[0][0]==player[1]  
        ){
            return true;
        }
        if(
            board[0][0]==player[0] && board[1][1]==player[0] && board[2][2]==player[0]  
        ||  board[2][2]==player[0] && board[1][1]==player[0] && board[0][0]==player[0]  
        ){
            return true;
        }
        //----------------------------------------------------------------------------
        if(//....> check 2 <....
            board[0][1]==player[0] && board[1][1]==player[0] && board[2][1]==player[0]  
        ||  board[2][1]==player[1] && board[1][1]==player[1] && board[0][1]==player[1]  
        ){
            return true;
        }
        if(
            board[1][0]==player[0] && board[1][1]==player[0] && board[1][2]==player[0]  
        ||  board[1][2]==player[1] && board[1][1]==player[1] && board[1][0]==player[1]  
        ){
            return true;
        }
        //----------------------------------------------------------------------------
        if(//....> check 3 <....
            board[0][2]==player[0] && board[1][2]==player[0] && board[2][2]==player[0]  
        ||  board[1][2]==player[1] && board[1][1]==player[1] && board[1][0]==player[1]  
        ){
            return true;
        }
        if(//....> check 3 <....
            board[2][0]==player[0] && board[2][1]==player[0] && board[2][2]==player[0]  
        ||  board[2][2]==player[1] && board[2][1]==player[1] && board[2][0]==player[1]  
        ){
            return true;
        }
        if(//....> check 3 <....
            board[2][0]==player[0] && board[1][1]==player[0] && board[0][2]==player[0]  
        ||  board[0][2]==player[1] && board[1][1]==player[1] && board[2][0]==player[1]  
        ){
            return true;
        }
        return false;
    }
}
