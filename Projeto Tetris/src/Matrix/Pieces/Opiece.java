/*
 * Piece.java
 *
 * última modificação: 09/05/2024
 *
 * Material utilizado para o Projeto Prático 01 [Tetris] aula de MC322 - Programação Orientada a Objetos
 */
package Matrix.Pieces;
import java.util.concurrent.ThreadLocalRandom;
import Matrix.Color;

/**
 *  Esta classe é referente à peça O. Contém seu construtor e métodos para a implementação.
 */
public class Opiece extends Piece {
    // Construtor
    public Opiece() {
        super();
        Color Y = Color.YELLOW;
        Color[][] form = {{Y, Y}, {Y, Y}};
        this.setForm(form);
        this.setRotation(0);
    }

    @Override
    public void spawn() {
        this.setX(ThreadLocalRandom.current().nextInt(1, 9));
        this.setY(0);
    }
}
