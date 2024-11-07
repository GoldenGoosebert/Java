public class Board {
   final static int Row = 3;
   final static int Col = 3;
      static char [][] board = new char[Row][Col];
   protected static int moveCount = 0;
      
      public Board(){
       for(int row = 0; row < Row; row++){
           for(int col = 0; col < Col; col++){
               board[row][col] = ' ';
           }
       }
      }
   
      protected void PrintBoard(){
       for(int row = 0; row < Row; row++){
               System.out.println(board[row][0] + "|" + board[row][1] + "|" + board[row][2]);
               if(row < 2){
                   System.out.println("-----");
           }
       }
      }
   
      public void moveIncrement(){
           moveCount += 1;
    }
      public int GetmoveCount(){
           return moveCount;
    }

  

    public void setBoard(int row, int column, int plyr){
            if(plyr == 1){
                board[row][column] = 'X';
            }
            if(plyr == 2){
                board[row][column] = 'O';
            }
    }

}

