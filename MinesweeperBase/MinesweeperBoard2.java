
/**
 * Write a description of class Minesweeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MinesweeperBoard2{
    Cell[] board;
    int rows;
    int columns;
    //added 
    int bombs; 
    int posBombs;
    public MinesweeperBoard2(){
        //Put the constructor here.
        this.rows = rows;//horizontal
        this.columns = columns;//diagonal 
        //replace int with long if change 
        board = new Cell[rows*columns];
        
        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());
        
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void addBombs(int bombs) throws Exception{
        //own code
        if ( bombs == 1){
            throw new Exception(" Trying to cheat I see.... Not happening sucker!");
        }
        else if (bombs >= 50){
            throw new Exception( "Trying to kill your self?! That's great!");
        }
        while (bombs > 0){
            this.bombs = bombs;
            // random bomb placement 
            int posBombs = (int) (Math.random()*(rows*columns));

            board[posBombs] = -1;
            bombs -= 1;

        }
    }

    public void addNums(){
      //own code 
      // location of bombs/numbers on board 
        for (int i = 0; i<board.length; i++){
            if (board[i]== -1){
            //right
            if (i + 1 < board.length && i % columns < columns-1 && board[i + 1] !=-1){
                    board[i + 1]++;
             }
            //left
            if ( i - 1 > board[0] &&  i % columns  !=0 && board[i - 1] != -1){
                   board[ i - 1]++;
             }
            //up
            if ( i - columns > board[0] && board [ i - columns ] !=-1){
                 board[i - columns]++;
                }
            //down
            if ( i + columns < board.length && board [ i + columns] !=-1){
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
 
    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        //added 
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
    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i< rows*columns; i++){
                board[i]= new Cell();
                panel.add(board[i].getButton());
        }
        return panel;
    }

}
