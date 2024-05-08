/*
* Piece.java
*
* última modificação: 08/05/2024
*
* Material utilizado para o Projeto Prático 01 [Tetris] aula de MC322 - Programação Orientada a Objetos
*/

package pieces;

import java.util.Objects;

/**
 *  Esta classe abstrata é o modelo para todas as peças do jogo;  contém assim os atributos e métodos para a implementação delas.
 */
public abstract class Piece  implements Movement{
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
        this.rotation = (this.rotation + rotation)%4;
    }

    /**
     * A função é responsável pela String de impressão a qual mostra a peça no tabuleiro.
     */
    @Override
    public abstract String toString();

    /**
     * A função é responsável por setar a peça no tabuleiro.
     */
    public abstract void spawn();

    /**
     * A função coordena o movimento de rotação da peça.
     */
    public void rotate(int windth){
        String movement = directionReading();
        if (Objects.equals(movement, "l")){
            if(checkBoardCapacityRotation(windth, this)){
                //checar tabuleiro
                this.setForm(rotateLeft());
                this.setRotation(1);
            }
        } else if (Objects.equals(movement, "d")){
            if (checkBoardCapacityRotation(windth, this)) {
                //checar tabuleiro
                this.setForm(rotateRight());
                this.setRotation(1);
            }
        }
    }

    /**
     * A função rotaciona a peça para a esquerda.
     *
     *  @return rotatedForm int[][]
     */
    public int[][] rotateLeft(){
        int windth = this.getForm().length;
        int heigth = this.getForm()[0].length;
        int[][] rotatedForm = new int[heigth][windth];
        for (int i=0; i<heigth; i++) {
            for (int j=0; j<windth; j++) {
                rotatedForm[i][j] = this.getForm()[windth - j - 1][i];
            }
        }
        return rotatedForm;
    }

    /**
     * A função rotaciona a peça para a direita.
     *
     * @return rotatedForm int[][]
     */
    public int[][] rotateRight(){
        int windth = this.getForm().length;
        int heigth = this.getForm()[0].length;
        int[][] rotatedForm = new int[heigth][windth];
        for (int i=0; i<heigth; i++) {
            for (int j=0; j<windth; j++) {
                rotatedForm[i][j] = this.getForm()[j][heigth - i - 1];
            }
        }
        return rotatedForm;
    }
    /**
     * A função coordena o movimento da peça.
     */
    public void move(int windth){
        String movement = directionReading();
        if (Objects.equals(movement, "l")){
            if (checkBoardCapacityMove(windth, this))
                moveLeft();
        } else if (Objects.equals(movement, "r")){
            if (checkBoardCapacityMove(windth, this))
                moveRight();
        }
    }

    /**
     * A função movimenta a peça para esquerda.
     */
    public void moveLeft(){
        this.addX(-1);
        this.addY(-1);
    }
    /**
     * A função movimenta a peça para direita.
     */
    public void moveRight(){
        this.addX(1);
        this.addY(1);
    }

    /**
     * A função adiciona 1 na posição x da peça.
     */
    public void addX(int i){
        this.setY(this.getX()+i);
    }

    /**
     * A função adiciona 1 na posição y da peça.
     */
    public void addY(int i){
        this.setY(this.getY()+i);
    }
}
