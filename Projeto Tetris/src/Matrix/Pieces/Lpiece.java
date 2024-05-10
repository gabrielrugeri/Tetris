/*
 * Lpiece.java
 *
 * última modificação: 09/05/2024
 *
 * Material utilizado para o Projeto Prático 01 [Tetris] aula de MC322 - Programação Orientada a Objetos
 */
package Matrix.Pieces;
import java.util.concurrent.ThreadLocalRandom;
import Matrix.Color;

/**
 *  Esta classe é referente à peça L. Contém seu construtor e métodos para a implementação.
 */
public class Lpiece extends Piece {
    // Construtor
    public Lpiece() {
        super();
        Color O = Color.ORANGE;
        Color W = Color.WHITE;
        Color[][] form = {{O ,W}, {O, W}, {O, O}};
        this.setForm(form);
        this.setRotation(0);
    }

    @Override
    public void spawn() {
        this.setX(ThreadLocalRandom.current().nextInt(2, 8));
        this.setY(0);
    }
}
