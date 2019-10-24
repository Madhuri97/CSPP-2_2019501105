// import sun.launcher.resources.launcher;

// import javax.swing.text.Position;

class Rock extends Piece {
    int row;
    int column;

    Rock(int r, int c) {
        // Position p = new Position(r,c);
        // this.position = p;
        this.row = r;
        this.column = c;
    }

    String getPosition() {
        return "(" + this.row + "," +this.column + ")";
    }
    //row= 0 , column = 7

    boolean isValidMove(Position newPosition) {
        
        if(super.isValidMove(newPosition.row, newPosition.column )) { //checks for boundary in the parent class
            //column = 3 current col = 0 row = 4 row = 0
            if(newPosition.column == this.column || newPosition.row == this.row) {
                return true;
            } else {
                System.out.println("WARNING: Rock can be moved only in straight directions");
                return false;
            }
        } else {
            System.out.println("WARINING: Sorry ur out of the board");
        return false;
        }
    }
    void changePosition(Position p) {
        this.row = p.row;
        this.column = p.column;
    }
}
class Queen extends Piece {
    int row;
    int column;
    Queen(int r, int c) {
        this.row = r;
        this.column = c;
    }
    boolean isValidMove(Position p) {
        //straight
        if(super.isValidMove(p.row, p.column )) {//checks for the border condition
            if((p.column - this.column) == (p.row - this.row)) {
                return true;
            }
            //diagonal +ve, +ve
            if((p.row - this.row) == (p.column - this.column)) {
                return true;
            }
            if((Math.abs(p.row - this.row)) == (Math.abs(p.column - this.column))) {
                return true;
            }
            System.out.println("WARNING: queen can't be moved to this position.");
            return false;
        } else {
            System.out.println("Is running out the board");
            return false;
        }
    } 
    void changePosition(Position p) {
        this.row = p.row;
        this.column = p.column;
    }
    String getPosition() {
        return "(" + this.row + "," +this.column + ")";
    }
}
