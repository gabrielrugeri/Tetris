/*
* Piece.java
*
* Ultima modificação: 10/05/2024
*
* Material utilizado para o Projeto Prático 01 [Tetris] aula de MC322 - Programação Orientada a Objetos
*/

package Pieces;
import Colors.Color;

/**
 *  Esta classe abstrata é o modelo para todas as peças do jogo;
 * Contém assim os atributos e métodos para a implementação delas.
 */
public abstract class Piece {
    private Color[][] form; // matriz representante da forma da peça.
    private int height; // numero de linhas da matriz-peca.
    private int width; // numero de colunas da matriz-peca.
    private int x;  // posicao do elemento [0][0] da peca no tabuleiro.
    private int y;  // posicao do elemento [0][0] da peca no tabuleiro.
    private int rotation;  // marca se a peça sofre rotação.

    public Color[][] getForm() {
        return form;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRotation() {
        return rotation;
    }

    public void setForm(Color[][] form) {
        this.form = form;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

        /**
     * A função adiciona i na posição x da peça.
     */
    public void addX(int i){
        x += i;
    }

    /**
     * A função adiciona i na posição y da peça.
     */
    public void addY(int i){
        y += i;
    }
    
    /**
     * A função movimenta a peça para esquerda.
     */
    public void moveLeft(){
        this.addX(-1);
    }

    /**
     * A função movimenta a peça para direita.
     */
    public void moveRight(){
        this.addX(1);
    }

    public void setRotation(int rotation) {
        this.rotation = (this.rotation + rotation) % 4;
    }

    /**
     * A função é responsável por setar a peça no tabuleiro.
     */
    public abstract void spawn();

    /**
     * A função é responsável pela String de impressão a qual mostra a peça no tabuleiro.
     */
    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                out.append(form[i][j]);
            }
            out.append('\n');
        }
        return out.toString();
    }

    /**
     * A função rotaciona a peça para a esquerda.
     *
     *  @return rotatedForm Colors[][]
     */
    public Color[][] rotateClockWise(){
        int aux;
        Color[][] rotatedForm = new Color[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                rotatedForm[i][j] = form[width - j - 1][i];
            }
        }
        aux = height;
        height = width;
        width = aux;
        this.setRotation(1);
        return rotatedForm;
    }

    /**
     * A função rotaciona a peça para a direita.
     *
     * @return rotatedForm Colors[][]
     */
    public Color[][] rotateCounterClockWise(){
        int aux;
        Color[][] rotatedForm = new Color[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                rotatedForm[i][j] = form[j][height - i - 1];
            }
        }
        aux = height;
        height = width;
        width = aux;
        this.setRotation(-1);
        return rotatedForm;
    }

}
