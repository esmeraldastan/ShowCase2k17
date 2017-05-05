
/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner{
   //test runner
    public static void main(){
        try {
        Minesweeper game = new Minesweeper();
        game.addBombs(10);
        game.numbsAdded();
        game.printBoard();
    }catch (Exception errorName){
        System.out.println();
        System.out.println("Error: " + errorName);
     }
  }
  //coustom game runner 
  public static void main2(int bombs, int row, int column){
    try {
        Minesweeper game = new Minesweeper(row, column);
        game.addBombs(bombs);
        game.numbsAdded();
        game.printBoard();
    }catch (Exception errorName){
        System.out.println();
        System.out.println("Error: " + errorName);
     
    }
   }
}




 /**
  * public class GR{
    public static void main(){
        try{
            System.out.println(Notes.score(91));
            System.out.println(Notes.score(81));
            System.out.println(Notes.score(-51));
        }catch (Exception errorName){
            System.out.println("Error: " + errorName);
    
       }
   }
}

  */  
 
 
 /**
  * public class Notes{
    public static String score(int percent)throws Exception{
        if (percent < 0 ) {     
            throw new Exception("You apparently cannot count");
        }
        if (percent > 90){
            return "A";
        }
        else if (percent > 80){
            return "B";
        }
        else if (percent > 70){
            return "C";
        }
        else if (percent > 60){
            return "D";
        }
        else{
            return "F";
        }
    }
   
}

  */
