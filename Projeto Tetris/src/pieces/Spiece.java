/*
 * Piece.java
 *
 * última modificação: 09/05/2024
 *
 * Material utilizado para o Projeto Prático 01 [Tetris] aula de MC322 - Programação Orientada a Objetos
 */
package pieces;

import java.util.concurrent.ThreadLocalRandom;

/**
 *  Esta classe é referente à peça S. Contém seu construtor e métodos para a implementação.
 */
public class Spiece extends Piece{
    // Construtor
    public Spiece() {
        super();
        this.setColor(Colours.ANSI_GREEN);
        int[][] form= {{7,7,0},{0,7,0},{0,7,7}};
        this.setForm(form);
        this.setWidth(this.getForm().length);
        this.setHeight(this.getForm()[0].length);
    }

    @Override
    public void spawn() {
        this.setX(ThreadLocalRandom.current().nextInt(2, 8));
    }
}
