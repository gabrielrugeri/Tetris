/*
 * Piece.java
 *
 * última modificação: 09/05/2024
 *
 * Material utilizado para o Projeto Prático 01 [Tetris] aula de MC322 - Programação Orientada a Objetos
 */

package Pieces;
import java.util.concurrent.ThreadLocalRandom;
import Colors.Color;


/**
 *  Esta classe é referente à peça J. Contém seu construtor e métodos para a implementação.
 */
public class Jpiece extends Piece {
    //Construtor
    public Jpiece() {
        super();
        Color B = Color.BLUE;
        Color W = Color.WHITE;
        Color[][] form = {{W, B}, {W, B}, {B, B}};
        this.setForm(form);
        this.setRotation(0);
    }

    @Override
    public void spawn() {
        this.setX(ThreadLocalRandom.current().nextInt(2, 7));
        this.setY(0);
    }
}
