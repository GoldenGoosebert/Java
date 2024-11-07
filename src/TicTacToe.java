package src;
import java.util.Scanner;

public class TicTacToe{
    public static void main(String[] args){
       Board board = new Board();
       WinConditions condition = new WinConditions();
       Scanner input = new Scanner(System.in);
        int player1row, player1column, player2row, player2column;
        boolean isOver = false;

       do{
        do{
            System.out.println("Player 1 turn");
            board.PrintBoard();
            player1row = input.nextInt();
            player1column = input.nextInt();

        }while (condition.LegalMove(player1row, player1column) != true);

        board.setBoard(player1row,player1column,1);
        board.moveIncrement();

        if(board.GetmoveCount() >= 4){
            if(condition.WinbyColumn(1) == true){
                isOver = true;
            }else if(condition.WinbyDiagonal(1) == true){
                isOver = true;
            }else if(condition.WinbyRow(1) == true){
                isOver = true;
            }else if(condition.Draw() == true){
                isOver = true;
            }
        }

        if(isOver != true){
            do{
                System.out.println("Player 2 turn");
                board.PrintBoard();
                player2row = input.nextInt();
                player2column = input.nextInt();
            }while(condition.LegalMove(player2row, player2column) != true);

            board.setBoard(player2row,player2column,2);
            board.moveIncrement();

            if(board.GetmoveCount() >= 4){
                if(condition.WinbyColumn(2) == true){
                    isOver = true;
                }else if(condition.WinbyDiagonal(2) == true){
                    isOver = true;
                }else if(condition.WinbyRow(2) == true){
                    isOver = true;
                }else if(condition.Draw() == true){
                    isOver = true;
                }
            }

        }
       }while (isOver == false);
    }
}