import Matrix.Board.Board;
import Matrix.Pieces.*;

public class Main {
    public static void main(String[] args) {
        Board B = new Board(20,10);
        PieceMovements(B);
        
        //Engine.run(B);
    }
    
    /**
     * Shows all the movements available for a piece
     * @param B: Board
     */
    public static void PieceMovements(Board B) {
    	
    	Piece p = new Jpiece();
        p.setX(5);
        p.setY(10);
            
        B.setFallingPiece(p);
        
        //Shows the piece on its original position on the board
        B.update(); 
        System.out.println(B);
        B.clear();
               
        p.moveLeft();
        B.update();
        System.out.println(B);
        B.clear();
        
        p.moveRight();
        B.update();
        System.out.println(B);
        B.clear();
             
        p.rotateClockWise();
        B.update();
        System.out.println(B);
        B.clear();
        
        p.rotateCounterClockWise();
        B.update();
        System.out.println(B);
        B.clear();
        
        Engine.DropDown(B, p);
        B.update();
        System.out.println(B);
        B.clear();
    }
}