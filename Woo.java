import java.io.*;
import java.util.*;

public class Woo{

  public String[][] board;
  public int moves;
  public static Connect4 game = new Connect4();

  public static Scanner in = new Scanner(System.in);

  public Woo(){
    board = new String[6][7];
    moves = 0;
    NewGame();
  }

  public static void NewGame(){
    String s = "";
    s = "================================================================\n";
    s += "Welcome! You are about to begin a game of Connect4\n";
    System.out.println(s);
    System.out.println("Columns are numbered left to right from 0-6");
    game.resetGame();
  }

  public static boolean playTurn(){
    System.out.println(game.boardRep());
    System.out.println("Player 1, pick a column to place a piece");
      try {
        int O = Integer.parseInt(in.nextLine());
  	    game.dropO(O); //Checks if this causes error
        if(game.dropO(O)==true){
          return true;
        }
      }
      catch (Exception e ) { //If error is caught
        System.out.println("An error has occured, plz try again.");
      }
      System.out.println(game.boardRep());
      System.out.println("Player 2, pick a column to place a piece");
      try {
        int X = Integer.parseInt( in.nextLine());
  	    game.dropX(X); //Checks if this causes error
        if(game.dropX(X)==true){
          return true;
        }
      }
      catch (Exception e ) { //If error is caught
        System.out.println("An error has occured, plz try again.");
      }
      return false;
  }


  public static void main(String[] args) {
    NewGame();
    while(!(playTurn())){
      playTurn();
    }
    System.out.println("The game has ended");
  }

  //Arrays.deepToString(int[][])

}
