public class Connect4{
  public String[][] board;
  public boolean hasWon;
  public int moves;

  public void Connect4(){
    board = new String[6][7];
    hasWon = false;
    moves = 0;
    resetGame();
  }

  public void clearBoard(){
    for(int i=0; i<6; i++){
      for(int j=0; j<7; j++){
        board[i][j] = ".";
      }
    }
  }

  public void resetGame(){
    hasWon = false;
    moves = 0;
    clearBoard();
  }

  public void dropO(int x){
    try{
      board[x][x] = ".";
    }
    catch(Exception e){
      System.out.println("Invalid column, drop again");
    }
  }

  public void dropX(int x){
    try{
      board[x][x] = ".";
    }
    catch(Exception e){
      System.out.println("Invalid column, drop again");
    }
  }



  public String boardRep(){
    for(int i=0; i<6; i++){
      String s = "";
      for(int j=0; j<7; j++){
        s += board[i][j];
      }
      System.out.println(s);
      return s;
    }
  }
}
