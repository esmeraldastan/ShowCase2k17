
/**
 * Write a description of class Minesweeper here.
 * 
 * @author Esmeralda Lopez
 * @version 10.22.16
 */

//final game for show case 
//creat gui for final
//4 days to work on

import java.lang.Math;
public class Minesweeper{
    //list 
    //long ---> replace int *option 
    int [] board; 
    int row;
    int column;
    int bombs; 
    int posBombs;
    public Minesweeper(int row, int column ){
        this.row = row;//horizontal
        this.column = column;//diagonal 
        //replace int with long if change 
        board = new int[row*column];
    }
    public Minesweeper(){
        this(10,10);
    }
    //gui added 
    public void printBoard( ){
        this.row=row;
        this.column = column; 

        System.out.println("     >>>>>>>>>>Welcome To Minesweeper<<<<<<<<");
        System.out.println();
        //number of rows and columns can be inserted 
        for (int i= 0; i <board.length; i++){
            //spacing in board 
            if (i %column == 0){
                System.out.println(" ");
            }
            if (board[i] == -1) {
                // * represent bombs
                System.out.print("* " );
            }

            else { 
                System.out.print(board[i] + " " ) ;
            }
        }
    }
    //adding of bombs
    //gui added
    public void addBombs(int bombs)throws Exception{
        if ( bombs == 1){
            throw new Exception(" Trying to cheat I see.... Not happening sucker!");
        }
        else if (bombs >= 101 ){
            throw new Exception( "Trying to kill your self?! That's great!");
        }
        
        while (bombs > 0){
            this.bombs = bombs;
            // random bomb placement 
          
            int posBombs = (int) (Math.random()*(row*column));
            if (board[posBombs]==0){
            board[posBombs] = -1;
            bombs -= 1;

        }
       }
    }
    
    
    //gui added
    public void numbsAdded(){
        // location of bombs/numbers on board 
        for (int i = 0; i<board.length; i++){
            if (board[i]== -1){
            //right
            if (i + 1 < board.length && i % column < column-1 && board[i + 1] !=-1){
                    board[i + 1]++;
             }
            //left
            if ( i - 1 > board[0] &&  i % column  !=0 && board[i - 1] != -1){
                   board[ i - 1]++;
             }
            //up
            if ( i - column > board[0] && board [ i - column ] !=-1){
                 board[i - column]++;
                }
            //down
            if ( i + column < board.length && board [ i + column] !=-1){
                board[i +column]++;
            }
            
            
            //up right 
            if ( (i - column) + 1 > board[0] && i % column < column-1 && board[( i - column) + 1 ] !=-1){
                board[( i - column)+ 1]++; 
            }
            // up left 
            if ( (i - column) - 1 > board[0] && i % column  !=0 && board[( i - column) - 1 ] !=-1){
                board[( i - column)- 1]++; 
            }
            //down right 
            if ( (i + column) + 1 < board.length && i % column < column-1 && board[( i + column) + 1 ] !=-1){
                board[( i + column)+ 1]++; 
            }
            // down left
             if ( (i + column) - 1 < board.length && i % column  !=0 && board[( i + column) - 1 ] !=-1){
                board[( i + column)- 1]++; 
            }
        }
      }
    }
}

