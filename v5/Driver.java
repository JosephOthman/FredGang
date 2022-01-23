import java.io.*;
import java.util.*;

public class Driver{

  public String[][] board;
  public static int moves;
  public static int badMoves;
  public static Connect4 game = new Connect4();
  public static boolean over = false;

  public static Scanner in = new Scanner(System.in);

  public Driver(){
    board = new String[6][7];
    moves = 0;
    NewGame();
  }

  public static void NewGame(){
    String s = "";
    s = "================================================================\n";
    s += "Welcome! You are about to begin a game of Connect4\n";
    s += "Be aware that columns are numbered from 0-6, not from 1-7!\n";
    System.out.println(s);
    System.out.println("Columns are numbered left to right from 0-6");
    game.resetGame();
  }

  public static void playTurn1(){
    System.out.println(game.boardRep());
    System.out.println("Player 1, pick a column to place a piece");
      try {
        int O = Integer.parseInt(in.nextLine());
        while((O<0) || (O>6)) {
          System.out.println("Please enter an integer between 0 and 6, inclusive.");
          O = Integer.parseInt(in.nextLine());
        }
        moves += 1;
          if(game.dropO(O)==true){
            over = true;
            System.out.println("Congrats! Player 1 has won the game! Here is the final board:");
            System.out.println(game.boardRep());
          }
      }
      catch (Exception e ) { //If error is caught
        badMoves += 1;
        System.out.println("An error has occured, plz try again.");
        playTurn1();
      }
    }
    public static void playTurn2() {
      System.out.println(game.boardRep());
      System.out.println("Player 2, pick a column to place a piece");
      try {
        int X = Integer.parseInt( in.nextLine());
        while((X<0) || (X>6)) {
          System.out.println("Please enter an integer between 0 and 6, inclusive.");
          X = Integer.parseInt(in.nextLine());
        }
        moves += 1;
          if(game.dropX(X)==true){
            over = true;
            System.out.println("Congrats! Player 2 has won the game! Here is the final board:");
            System.out.println(game.boardRep());
          }
      }
      catch (Exception e ) { //If error is caught
        badMoves += 1;
        System.out.println("An error has occured, plz try again.");
        playTurn2();
      }
  }


  public static void main(String[] args) {
    NewGame();
    while(((moves-badMoves) < 42) && (over == false)){
      playTurn1();
      if(over == false) {
        playTurn2();
      }
    }
    if(over == false) {
      System.out.println("The game has ended in a tie.");
    }
  }

  //Arrays.deepToString(int[][])

}
