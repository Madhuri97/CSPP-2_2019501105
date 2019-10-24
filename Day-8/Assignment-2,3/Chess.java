class Game {
    Piece [][] board; //board is the name of the array and pir=ece is its type
    // Constructor creates an empty board
    Game() {
    board = new Piece[8][8];
    }
}
class Position {
    int row;
    int column;
    // Constructor using row and column values
    Position(int r, int c) {
    this.row = r;
    this.column = c;
    }
    public String getPosition() {
        return "(" + this.row + "," + this.column + ")";
    }
}

class Piece {
    Position position;
    boolean isValidMove(int row, int column) {
        if(row >= 0 && column >= 0 && row < 8 && column < 8) {
            return true;
        } else {
            return false;
            }
        }
    }   
    
final class Chess{
    public static void main(String[] args) {
    //     Rock rock1 = new Rock(0,0);
    //     // Rock rock2 = new Rock(0,7);
    //     System.out.println("Current position: " + "(" + rock1.row + "," + rock1.column + ")");
    //     Position newPosForR1 = new Position(8,8);
            
    //     if(rock1.isValidMove(newPosForR1)) {
    //         System.out.println("Valid:) can be moved and moving to :" + newPosForR1.getPosition());
    //         rock1.changePosition(newPosForR1);
    //     } else {
    //         System.out.println("Invalid:( can't be moved to " + newPosForR1.getPosition());
    //     }
    //     System.out.println("Current position: " + "(" + rock1.row + "," + rock1.column + ")");  
    // }   
    Queen queen = new Queen(0,4);
    System.out.println("on start" + queen.getPosition());
    Position newPosition = new Position(2,6);

    if(queen.isValidMove(newPosition)) {
        System.out.println("Yes it can be moved");
        queen.changePosition(newPosition);
    }
    System.out.println("After move " + queen.getPosition());
}
}
