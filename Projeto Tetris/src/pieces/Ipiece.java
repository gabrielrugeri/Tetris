/*
 * Ipiece.java
 *
 * última modificação: 09/05/2024
 *
 * Material utilizado para o Projeto Prático 01 [Tetris] aula de MC322 - Programação Orientada a Objetos
 */
package Pieces;
import java.util.concurrent.ThreadLocalRandom;
import Colors.Color;

/**
 *  Esta classe é referente à peça I. Contém seu construtor e métodos para a implementação.
 */
public class Ipiece extends Piece {
    // Construtor.
    public Ipiece() {
        super();
        Color C = Color.CYAN;
        Color[][] form = {{C}, {C}, {C}, {C}};
        this.setForm(form);
        this.spawn();
        this.setRotation(0);
    }

    @Override
    public void spawn() {
        this.setX(ThreadLocalRandom.current().nextInt(0, 10));
        this.setY(0);
    }
}
