package TicTacToe;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {

    Deque<Player> players;
    Board board;

    Game(){
        initializeGame();
    }

    public void initializeGame(){
        players=new LinkedList<>();
        Player player1=new Player("Player1", new PlayingPiece(PlayingPiece.PieceType.X));
        Player player2=new Player("Player2", new PlayingPiece(PlayingPiece.PieceType.O));
        players.add(player1);
        players.add(player2);
        board=new Board(3);
    }

    public String startGame(){
        boolean noWinner=true;
        while(noWinner){
            Player playerTurn=players.removeFirst();
            board.printBoard();
            List<Pair<Integer,Integer> > freeCells=board.freeCellsList();
            if(freeCells.isEmpty()){
                noWinner=false;
                continue;
            }

            System.out.println(playerTurn.getName()+" turn: ");
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String[] str=s.split(",");
            int i=Integer.parseInt(str[0]);
            int j=Integer.parseInt(str[1]);

            boolean addingNewMove= board.addNewMove(playerTurn,i,j);
            if(!addingNewMove){
                System.out.println("Incorrect move, please move accordingly. ");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);
            boolean isThereWinner= board.isThereAnyWinner(i,j,playerTurn);
            if(isThereWinner){
               return playerTurn.getName();
            }
        }

        return "tie";
    }
}
