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
      int row=5;
      for(int j=5; j>=0; j--){
        if(!(board[j][x].equals("."))){
          row--;
        }
      }
      board[row][x] = "O";
      String checker = "OOOO";
      String vert = "";
      String horiz = "";
      String diag1 = "";
      String diag2 = "";
      for(int j=5; j>=row; j--){
        vert+=board[j][x];
      }
      if(vert.indexOf(checker)>=0){
        hasWon = true;
      }
      for(int j=0; j<7; j++){
        horiz+=board[row][j];
      }
      if(horiz.indexOf(checker)>=0){
        hasWon = true;
      }

    }
    catch(Exception e){
      System.out.println("Invalid column, drop again");
    }
  }

  public void dropX(int x){
    try{
      int row=5;
      for(int j=5; j>=0; j--){
        if(!(board[j][x].equals("."))){
          row--;
        }
      }
      board[row][x] = "X";
    }
    catch(Exception e){
      System.out.println("Invalid column, drop again");
    }
  }

}
