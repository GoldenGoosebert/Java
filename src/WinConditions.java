package src;

public class WinConditions extends Board {
    
    public boolean WinbyRow(int player){
        for(int i=0; i<3; i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' '){
                if(player == 1){
                    System.out.println("Player 1 wins");
                    PrintBoard();
                    return true;
                }else{
                    System.out.println("Player 2 wins");
                    PrintBoard();
                    return true;
                }
            }
        } return false;
    }

    public boolean WinbyColumn(int player){
        for(int i=0; i<3; i++){
            if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' '){
                if(player == 1){
                    System.out.println("Player 1 wins");
                    System.out.println("--------");
                    PrintBoard();
                    return true;
                }else{
                    System.out.println("Player 2 wins");
                    System.out.println("--------");
                    PrintBoard();
                    return true;
                }
            }
        } return false;
    }

    public boolean WinbyDiagonal(int player){
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' '){
            if(player == 1){
                System.out.println("Player 1 wins");
                return true;
            }else{
                System.out.println("Player 2 wins");
                return true;
            }
        }
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' '){
            if(player == 1){
                System.out.println("Player 1 wins");
                return true;
            }else{
                System.out.println("Player 2 wins");
                return true;
            }
        } return false;
    } 
    
    
    boolean LegalMove(int row, int column){
        if(row > 2 && column > 2){
            System.out.println("Illegal input -> input between 0 & 2 is allowed");
            return false;
        }else if(row > 2){
            System.out.println("Illegal row input -> input between 0 & 2 is allowed");
            return false;
        }else if(column > 2){
            System.out.println("Illegal column input -> input between 0 & 2 is allowed");
            return false;
        }
        if(board[row][column] != ' '){
            System.out.println("Illegal input");
            return false;
        }else{
            return true;
        }
    }
   public boolean Draw(){
    if(moveCount == 9){
        System.out.println("full board");
        PrintBoard();
        return true;
    }else{
        return false;
    }
}
}
