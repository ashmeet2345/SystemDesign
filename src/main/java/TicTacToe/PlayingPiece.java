package TicTacToe;

public class PlayingPiece {
    enum PieceType{
        X,
        O
    };

    PieceType type;
    PlayingPiece(PieceType type){
        this.type=type;
    }
}
