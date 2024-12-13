package SnakeAndLadder;

public class Player {
    String id;
    int currentPos;

    Player(String id, int currentPos){
        this.id=id;
        this.currentPos=currentPos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCurrentPos() {
        return currentPos;
    }

    public void setCurrentPos(int currentPos) {
        this.currentPos = currentPos;
    }
}
