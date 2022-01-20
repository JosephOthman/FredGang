import java.util.Scanner;
import java.io.*;

public class Driver{
  public static Connect4 game = new Connect4();

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);  // Create a Scanner object
    String s = "";
    s = "================================================================\n";
    s += "Welcome! You are about to begin a game of Connect4\n";
    s += "Player 1, will use the X piece, and player 2 will use the O piece.";

    System.out.println(s);

    System.out.println("Here is the current board");
    System.out.println(game.board);

    while (true) {

      System.out.println("Player 1, which column would you like to drop your piece into?");
      try {
        int col = Integer.parseInt(in.nextLine());
        game.dropX(col);
        System.out.println("Here is the current board");
        System.out.println(game.board);
        if (game.hasWon == true) {
          System.out.println("Player 1 wins!");
          break;
        }
      }
      catch (Exception e) {}

      System.out.println("Player 1, which column would you like to drop your piece into?");
      try {
        int col = Integer.parseInt(in.nextLine());
        game.dropX(col);
        System.out.println("Here is the current board");
        System.out.println(game.board);
        if (game.hasWon == true) {
          System.out.println("Player 1 wins!");
          break;
        }
      }
      catch (Exception e) {}

    }




  }

}
