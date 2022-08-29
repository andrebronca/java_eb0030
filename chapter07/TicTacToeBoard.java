package chapter07;


/**
 * Escreva uma descrição da classe TicTacToeBoard aqui.
 * Jogo da velha
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TicTacToeBoard{
    private char[][] board;
    
    public TicTacToeBoard(){
        board = new char[3][3];
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[r].length; c++){
                board[r][c] = '-';
            }
        }
    }
    
    public void fillSpaceOnBoard(int row, int col, char value){
        if ((row < board.length) && (col < board[row].length)){
            board[row][col] = value;   
        }
    }
    
    public void displayBoard(){
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                System.out.print(board[row][col] +" ");
            }
            System.out.println();
        }
    }
    
    public void makeSomeMoves(){
        fillSpaceOnBoard(1, 1, 'X');
        fillSpaceOnBoard(0, 2, 'O');
        displayBoard();
    }
}
