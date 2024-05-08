/*
 * Piece.java
 *
 * última modificação: 08/05/2024
 *
 * Material utilizado para o Projeto Prático 01 [Tetris] aula de MC322 - Programação Orientada a Objetos
 */
package pieces;

import java.util.Scanner;

/**
 *  Esta interface contém funcções que auxiliam a estruturação da peça no tabuleiro.
 */
public interface Movement {
    Scanner input = new Scanner(System.in);

    /**
     *  Esta função confere a direção que a peça vai se mover ou rotacionar.
     */
    default String directionReading(){
        System.out.println("""
                Para qual direção?
                l - esquerda
                r - direita""");
        return input.nextLine();
    }

    /**
     *  Esta função checa se é possível girar a peça, ou seja, se há espaço no tabuleiro.
     */
    default boolean checkBoardCapacityRotation(int windth, Piece piece){
        for(int i = 0; i < piece.getForm().length;i++){
            if (piece.getX()+piece.getForm()[i].length>windth) {
                return false;
            }
        }
        return true;
    }

    /**
     *  Esta função checa se é possível mover a peça, ou seja, se há espaço no tabuleiro.
     */
    default boolean checkBoardCapacityMove(int windth, Piece piece){
        return piece.getX() + piece.getForm().length < windth;
    }
}
