/*
* Piece.java
*
* última modificação: 09/05/2024
*
* Material utilizado para o Projeto Prático 01 [Tetris] aula de MC322 - Programação Orientada a Objetos
*/

package pieces;

/**
 *  Esta classe abstrata é o modelo para todas as peças do jogo;  contém assim os atributos e métodos para a implementação delas.
 */
public abstract class Piece {
    private String color;
    private int[][] form; // matriz representante da forma da peça.
    private int height;  // altura da matriz da peça.
    private int width; // largura da matriz da peça.
    private int x;  // posição mais à esquerda superior da peça no tabuleiro.
    private int y;  // posição mais à esquerda superior da peça no tabuleiro.
    private int rotation;  // marca se a peça sofre rotação.


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int[][] getForm() {
        return form;
    }

    public void setForm(int[][] form) {
        this.form = form;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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

    // Construtor.
    public Piece() {
        this.y = 0;
        this.rotation = 0;
    }

    /**
     * A função é responsável pela String de impressão a qual mostra a peça no tabuleiro.
     */
    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for(int i=0; i<this.getForm().length;i++) {
            for (int j = 0; j < this.getForm()[i].length; j++)
                out.append(((this.getForm()[i][j] > 0) ? STR."\{this.getColor()}  \{Colours.ANSI_RESET}" : STR."\{Colours.ANSI_WHITE}  \{Colours.ANSI_RESET}"));
            out.append("\n");
        }
        return out.toString();
    }

    /**
     * A função rotaciona a peça para a esquerda.
     */
    public void rotateClockWise(){
        int[][] rotatedForm = new int[this.getHeight()][this.getWidth()];
        for (int i=0; i<this.getHeight(); i++) {
            for (int j=0; j<this.getWidth(); j++) {
                rotatedForm[i][j] = this.getForm()[this.getWidth() - j - 1][i];
            }
        }
        this.setRotation(1);
        this.setForm(rotatedForm);
        this.setHeight(this.getForm()[0].length);
        this.setWidth(this.getForm().length);
    }

    /**
     * A função rotaciona a peça para a direita.
     */
    public void rotateCounterClockWise(){
        int[][] rotatedForm = new int[this.getHeight()][this.getWidth()];
        for (int i=0; i<this.getHeight(); i++) {
            for (int j=0; j<this.getWidth(); j++) {
                rotatedForm[i][j] = this.getForm()[j][this.getHeight() - i - 1];
            }
        }
        this.setRotation(-1);
        this.setForm(rotatedForm);
        this.setHeight(this.getForm()[0].length);
        this.setWidth(this.getForm().length);
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

    /**
     * A função adiciona i na posição x da peça.
     */
    public void addX(int i){
        this.setY(this.getX()+i);
    }

    /**
     * A função adiciona i na posição y da peça.
     */
    public void addY(int i){
        this.setY(this.getY()+i);
    }

    /**
     * A função é responsável por setar a peça no tabuleiro.
     */
    public abstract void spawn();
}
