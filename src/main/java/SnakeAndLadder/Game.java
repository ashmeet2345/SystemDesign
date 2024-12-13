package SnakeAndLadder;

import java.util.Deque;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> players;
    Player winner;

    public Game(){
        initializeGame();
    }

    private void initializeGame() {
        board=new Board(10,5,5);
        dice=new Dice(1);
        winner=null;
        addPlayers();
    }

    private void addPlayers() {
        Player player1=new Player("1",0);
        Player player2=new Player("2",0);
        players.add(player1);
        players.add(player2);
    }

    public void startGame(){
        while(winner==null){
            Player playerTurn=playerTurn();
            int position=playerTurn.currentPos;
            int diceRoll= dice.rollDice();
            position+=diceRoll;
            position=jumpCheck(position);
            playerTurn.currentPos=position;
            System.out.println("Player turn id: "+playerTurn.id+" new position is: "+playerTurn.currentPos);

            if(position>=board.cells.length*board.cells.length-1){
                winner=playerTurn;
            }
        }
        System.out.println("Winner is: "+winner.id);
    }

    private int jumpCheck(int position) {
        if(position > board.cells.length*board.cells.length-1){
            return position;
        }

        Cell cell=board.getCell(position);
        if(cell.jump!=null && cell.jump.start==position){
            String jumpBy=(cell.jump.start>cell.jump.end?"Snake":"Ladder");
            System.out.println("Jump done by: "+jumpBy);
            return cell.jump.end;
        }
        return position;
    }

    private Player playerTurn() {
        Player player=players.removeFirst();
        players.addLast(player);
        return player;
    }
}
