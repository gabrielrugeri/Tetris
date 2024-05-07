/*
* Piece.java
*
* última modificação: 06/05/2024
*
* Material utilizado para o Projeto Prático 01 [Tetris] aula de MC322 - Programação Orientada a Objetos
*/

package pieces;

/**
 *  ESta classe abstrata é o modelo para todas as peças do jogo;  contém assim os atributos e métodos para a implementação delas.
 * */
public abstract class Piece {
    private int color;
    private int[][] form; // matriz representante da forma da peça.
    private int x;  // posição mais à esquerda superior da peça no tabuleiro.
    private int y;  // posição mais à esquerda superior da peça no tabuleiro.
    private int rotation;  // marca se a peça sofre rotação.

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int[][] getForm() {
        return form;
    }

    public void setForm(int[][] form) {
        this.form = form;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    /**
     * A função é responsável por criar a peça no tabuleiro.
     */
    public abstract void spawn();

    /**
     * A função coordena o movimento de rotação da peça.
     */
    public abstract void rotate();

    /**
     * A função estabelece a decida acentuada da peça.
     */
    public abstract void dropDown();
}
