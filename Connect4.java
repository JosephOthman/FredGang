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
      int column=x;
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
      int c1 = column;
      int r1 = row;
      while((c1>=0 && r1>=0)){
        c1--;
        r1--;
      }
      int c2 = column;
      int r2 = row;
      while((c2<=6 && r2>=0)){
        c2++;
        r2--;
      }
      while((c1<=6 && r1<=5)){
        diag1+=board[c1][r1];
        c1++;
        r1++;
      }
      while((c2>=0 && r2<=5)){
        diag2+=board[c2][r2];
        c2--;
        r2++;
      }
      if(diag1.indexOf(checker)>=0){
        hasWon = true;
      }
      if(diag2.indexOf(checker)>=0){
        hasWon = true;
      }

    }
    catch(Exception e){
      System.out.println("Invalid column, drop again");
    }
  }

  public void dropX(int x){
    try{
      int column=x;
      int row=5;
      for(int j=5; j>=0; j--){
        if(!(board[j][x].equals("."))){
          row--;
        }
      }
      board[row][x] = "X";
      String checker = "XXXX";
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
      int c1 = column;
      int r1 = row;
      while((c1>=0 && r1>=0)){
        c1--;
        r1--;
      }
      int c2 = column;
      int r2 = row;
      while((c2<=6 && r2>=0)){
        c2++;
        r2--;
      }
      while((c1<=6 && r1<=5)){
        diag1+=board[c1][r1];
        c1++;
        r1++;
      }
      while((c2>=0 && r2<=5)){
        diag2+=board[c2][r2];
        c2--;
        r2++;
      }
      if(diag1.indexOf(checker)>=0){
        hasWon = true;
      }
      if(diag2.indexOf(checker)>=0){
        hasWon = true;
      }

    }
    catch(Exception e){
      System.out.println("Invalid column, drop again");
    }
  }

}
