package TicTacToe;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    PlayingPiece[][] board;

    Board(int size){
        this.size=size;
        board=new PlayingPiece[size][size];
    }

    public void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(board[i][j]+"|");
            }
            System.out.println();
        }
    }

    public List<Pair<Integer,Integer> > freeCellsList(){
        List<Pair<Integer,Integer>> list=new ArrayList<>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    list.add(Pair.of(i,j));
                }
            }
        }
        return list;
    }

    public boolean addNewMove(Player player, int i,int j){
        if(board[i][j]!=null || i<0 || i>=size || j<0 || j>=size){
            return false;
        } else {
            board[i][j]=player.getPiece();
            return true;
        }
    }

    public boolean isThereAnyWinner(int row,int column, Player player){
        boolean rowWinner=true;
        boolean columnWinner=true;
        boolean diagonalWinner=true;
        boolean antiDiagonalWinner=true;

        for(int i=0;i<size;i++){
            if(i==column){
                continue;
            } else {
                if(board[row][i]==null || board[row][i]!=player.getPiece())
                    rowWinner=false;
            }
        }

        for(int i=0;i<size;i++){
            if(i==row){
                continue;
            } else {
                if(board[i][column]==null || board[i][column]!=player.getPiece()){
                    columnWinner=false;
                }
            }
        }

        for(int i=0,j=0;i<size;j++,i++){
            if(i==row && j==column){
                continue;
            } else {
                if(board[i][j]!=player.getPiece() || board[i][j]==null){
                    diagonalWinner=false;
                }
            }
        }

        for(int i=0,j=size-1;i<size;j--,i++){
            if(i==row && j==column){
                continue;
            } else {
                if(board[i][j]!=player.getPiece() || board[i][j]==null){
                    antiDiagonalWinner=false;
                }
            }
        }
        return rowWinner||columnWinner||diagonalWinner||antiDiagonalWinner;
    }

}
