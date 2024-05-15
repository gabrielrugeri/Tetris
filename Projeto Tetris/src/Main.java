import Matrix.Board.Board;
import Matrix.Pieces.Ipiece;
import Matrix.Pieces.Jpiece;
import Matrix.Pieces.Piece;

public class Main {
    public static void main(String[] args) {
        Board B = new Board(20, 10);

        deletefullline(B);
    }
    public static void deletefullline(Board B){
        System.out.println(B);

        Piece I = new Ipiece();
        I.setX(0);
        I.setY(0);

        //Mostra a peça no tabuleiro
        B.setFallingPiece(I);
        B.update();
        System.out.println(B);
        B.clear();

        //Rotacionar
        I.rotateClockWise();
        B.update();
        System.out.println(B);
        B.clear();

        //Drop down
        Engine.DropDown(B, I);
        B.update();
        System.out.println(B);
        B.updateLanded();
        B.clearPiece();


        Piece J = new Jpiece();
        J.setX(4);
        J.setY(0);
        //Mostra a peça no tabuleiro
        B.setFallingPiece(J);
        B.update();
        System.out.println(B);
        B.clear();

        //Drop down
        Engine.DropDown(B, J);
        B.update();
        System.out.println(B);
        B.updateLanded();
        //B.clear();
        B.clearPiece();

        Piece M = new Ipiece();
        M.setX(6);
        M.setY(0);

        //Mostra a peça no tabuleiro
        B.setFallingPiece(M);
        B.update();
        System.out.println(B);
        B.clear();

        //Rotacionar
        M.rotateClockWise();
        B.update();
        System.out.println(B);
        B.clear();

        //Drop down
        Engine.DropDown(B, M);
        B.update();
        System.out.println(B);
        B.updateLanded();
        B.clearPiece();


        B.deleteLine(19);
        System.out.println(B);
        }
}



