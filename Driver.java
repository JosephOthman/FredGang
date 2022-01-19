import java.io.*;

public class Driver{
  private static InputStreamReader isr;
  private static BufferedReader in;
  public static int pieceType;

  public Driver(){
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
  }

  public static void main(String[] args) {
    String s = "";
    pieceType = 1;
    s = "================================================================\n";
    s += "Welcome! You are about to begin a game of Connect4\n";
    s += "Player 1, which piece do you wish to use?\n";
    s += "1: X\n";
    s += "2: O\n";
    s += "Selection: ";

    System.out.println(s);

    try {
	    pieceType = Integer.parseInt( in.readLine() ); //Checks if this causes error
    }
    catch ( IOException e ) { //If error is caught
      System.out.println("An error has occured, plz try again.");
    }
  }

  //Arrays.deepToString(int[][])

}
