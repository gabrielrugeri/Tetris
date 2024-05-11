/*
 * Board.java
 * 
 *
 * Ultima modificação: 10/05/2024
 *
 * Material utilizado para o Projeto Pratico 01 [Tetris] aula de MC322 - Programacao Orientada a Objetos
 */

package Matrix.Board;
import Matrix.Matrix;
import Matrix.Pieces.Piece;
import Matrix.Color;

public class Board extends Matrix {
    private int score;
    private Piece fallingPiece;

    public Board(int height, int width) {
        super(height, width);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                form[i][j] = Color.WHITE;
            }
        }
        this.score = 0;
        this.fallingPiece = null;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        this.score += points;
    }

    public Piece getFallingPiece() {
        return fallingPiece;
    }
    
    public void setFallingPiece(Piece fallingPiece) {
        this.fallingPiece = fallingPiece;
    }

    public void clearPiece() {
        this.setFallingPiece(null);
    }

    /*
     * Pinta o board de acordo com a posicao da peca
     */
    public void update() {
        int x = fallingPiece.getX();
        int y = fallingPiece.getY();
        int m = fallingPiece.getHeight();
        int n = fallingPiece.getWidth();
        for (int i = y; i < y + m; i++) {
            for (int j = x; j < x + n; j++) {
                form[i][j] = fallingPiece.getForm()[i - y][j - x];
            }
        }
    }

    /*
     * Inversa da funcao update.
     * Limpa a peca atual do board.
     */
    public void clear() {
        int x = fallingPiece.getX();
        int y = fallingPiece.getY();
        int m = fallingPiece.getHeight();
        int n = fallingPiece.getWidth();
        for (int i = y; i < y + m; i++) {
            for (int j = x; j < x + n; j++) {
                form[i][j] = Color.WHITE;
            }
        }
    }
}
