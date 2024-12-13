package SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    Board(int boardSize, int numberOfSnakes, int numberOfLadders){
        initializeGame(boardSize);

    }

    private void initializeGame(int boardSize){
        cells=new Cell[boardSize][boardSize];

        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                cells[i][j]=new Cell();
            }
        }
    }

    private void addSnakesAndLadders(int numberOfSnakes, int numberOfLadders){
        while(numberOfSnakes>0){
            int snakeHead= ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int snakeTail=ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);

            if(snakeTail>=snakeHead){
                continue;
            }

            Jump jump=new Jump();
            jump.start=snakeHead;
            jump.end=snakeTail;
            Cell cell=getCell(snakeHead);
            cell.jump=jump;

            numberOfSnakes--;
        }
        while(numberOfLadders>0){
            int ladderStart= ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int ladderEnd=ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);

            if(ladderStart>=ladderEnd){
                continue;
            }

            Jump jump=new Jump();
            jump.start=ladderStart;
            jump.end=ladderEnd;
            Cell cell=getCell(ladderStart);
            cell.jump=jump;

            numberOfLadders--;
        }
    }

    public Cell getCell(int playerPosition){
        int boardRow = playerPosition / cells.length;
        int boardColumn = (playerPosition % cells.length);

        return cells[boardRow][boardColumn];

    }
}
