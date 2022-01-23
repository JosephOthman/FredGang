import java.io.*;
import java.util.*;

public class Woo{

  public String[][] board;
  public static int moves;
  public static int badMoves;
  public static Connect4 game = new Connect4();
  public static boolean over = false;

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
      catch (ArrayIndexOutOfBoundsException e ) {
        System.out.println("Column is full!");
        moves--;
        playTurn1();
      }
      catch(Exception e){
        System.out.println("Error, not a number.");
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
      catch (ArrayIndexOutOfBoundsException e ) {
        System.out.println("Column is full!");
        moves--;
        playTurn2();
      }
      catch (Exception e ) { //If error is caught
        System.out.println("Error, not a number.");
        playTurn2();
      }
  }

  public static void main(String[] args) {
    NewGame();
    while((moves < 42) && (over == false)){
      playTurn1();
      if(over == false) {
        playTurn2();

      }
    }
    if(over == false) {
      System.out.println(game.boardRep());
      System.out.println("The game has ended in a tie.");
    }
  }


}
