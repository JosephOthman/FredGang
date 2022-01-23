import java.io.*;

public class Woo{

  public String[][] board;
  public boolean hasWon;
  public int moves;
  private static int O;
  private static int X;
  private static InputStreamReader isr;
  private static BufferedReader in;

  public Woo(){
    board = new String[6][7];
    hasWon = false;
    moves = 0;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
  }

  public void NewGame(){
    String s = "";
    s = "================================================================\n";
    s += "Welcome! You are about to begin a game of Connect4\n";
    System.out.println(s);
    System.out.println("Columns are numbered left to right from 0-6");

  }

  public static void main(String[] args) {
    Connect4 game = new Connect4();
    game.clearBoard();
    while(true){
    System.out.println(game.boardRep());
    System.out.println("Player 1, pick a column to place a piece");
      try {
        O = Integer.parseInt( in.readLine());
  	    game.dropO(O); //Checks if this causes error
      }
      catch ( IOException e ) { //If error is caught
        System.out.println("An error has occured, plz try again.");
      }
    }
  }

  //Arrays.deepToString(int[][])

}
