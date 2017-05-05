
/**
 * Write a description of class NewGameRunner here.
 * 
 * @author Esmeralda Lopez
 * @version 1.20.17
 */
public class NewGameRunner
{
  //test runner
    public static void main(String[] args){
        try {
        NewMinesweeper game = new NewMinesweeper();
        game.addBombs(10);
        game.numbsAdded();
        game.printBoard2();
    }catch (Exception errorName){
        System.out.println();
        System.out.println("Error: " + errorName);
     }
  }
  //second game runner 
  public static void main2(int bombs, int row, int column){
    try {
        NewMinesweeper game = new NewMinesweeper(row, column);
        game.addBombs(bombs);
        game.numbsAdded();
        game.printBoard2();
    }catch (Exception errorName){
        System.out.println();
        System.out.println("Error: " + errorName);
     
    }
   }
}
