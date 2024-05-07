import pieces.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Engine Class
 * Defines all the function to make the Tetris game work, including Collision Checking,
 * Row Completion Checks and the main Run function.
 * (#WIP) ADD SCORES
 */
public class Engine {
    /**
     * Checks if a landed piece will overflow over the board.
     * @param P: Piece
     * @param B : Board
     * @return True if it will overflow the board upper limit, False otherwise
     */
    public static boolean CheckCollisionOver(Piece P, Board_Mock B) {
        int piece_height = P.getForm().length;
        int piece_width = P.getForm()[0].length;
        int piece_y = P.getY();
        int piece_x = P.getX();
        //Checks every cell of the form[][] of the piece
        for (int y = piece_y; y < piece_y + piece_height; y++) {
            for (int x = piece_x; x < piece_x + piece_width; x++) {
                //If there are a piece part on the cell, checks for overflown
                if (P.getForm()[y - piece_y][x - piece_x] != 0) {
                    //Piece overflowed the board
                    if (y - 1 < 0)
                        return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if a piece will colide with another piece or the board limits under it.
     * @param P: Piece
     * @param B : Board
     * @return True if it will colide under it, False otherwise
     */
    public static boolean CheckCollisionUnder(Piece P, Board_Mock B) {
        int piece_height = P.getForm().length;
        int piece_width = P.getForm()[0].length;
        int piece_y = P.getY();
        int piece_x = P.getX();
        //Checks every cell of the form[][] of the piece
        for (int y = piece_y; y < piece_y + piece_height; y++) {
            for (int x = piece_x; x < piece_x + piece_width; x++) {
                //If there are a piece part on the cell, checks for collision
                if (P.getForm()[y - piece_y][x - piece_x] != 0) {
                    //Out of bounds collision
                    if (y + 1 >= B.getHeight())
                        return true;
                    //Piece to piece collision
                    if (B.getLanded()[y + 1][x] != 0)
                        return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if a piece will colide with another piece or the board limits left of it.
     * @param P: Piece
     * @param B : Board
     * @return True if it will colide left of it, False otherwise
     */
    public static boolean CheckCollisionLeft(Piece P, Board_Mock B) {
        int piece_height = P.getForm().length;
        int piece_width = P.getForm()[0].length;
        int piece_y = P.getY();
        int piece_x = P.getX();
        //Checks every cell of the form[][] of the piece
        for (int y = piece_y; y < piece_y + piece_height; y++) {
            for (int x = piece_x; x < piece_x + piece_width; x++) {
                //If there are a piece part on the cell, checks for collision
                if (P.getForm()[y - piece_y][x - piece_x] != 0) {
                    //Out of bounds collision
                    if (x - 1 < 0)
                        return true;
                    //Piece to piece collision
                    if (B.getLanded()[y][x-1] != 0)
                        return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if a piece will colide with another piece or the board limits right of it.
     * @param P: Piece
     * @param B : Board
     * @return True if it will colide right of it, False otherwise
     */
    public static boolean CheckCollisionRight(Piece P, Board_Mock B) {
        int piece_height = P.getForm().length;
        int piece_width = P.getForm()[0].length;
        int piece_y = P.getY();
        int piece_x = P.getX();
        //Checks every cell of the form[][] of the piece
        for (int y = piece_y; y < piece_y + piece_height; y++) {
            for (int x = piece_x; x < piece_x + piece_width; x++) {
                //If there are a piece part on the cell, checks for collision
                if (P.getForm()[y - piece_y][x - piece_x] != 0) {
                    //Out of bounds collision
                    if (x + 1 >= B.getWidth())
                        return true;
                    //Piece to piece collision
                    if (B.getLanded()[y][x+1] != 0)
                        return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if a row is completed with Tetrominoes
     * @param B: Board
     * @param y: Position of the row to check for completion
     * @return true if row is complete, otherwise false
     */
    public static boolean CheckRowCompletion(Board_Mock B, int y) {
        for (int x = 0; x < B.getWidth(); x++) {
            if (B.getLanded()[y][x] == 0)
                return false;
        }
        return true;
    }

    /**
     * Runs the game with the specified conditions
     * @param B: Board to run the game
     */
    public static void run(Board_Mock B) {
        //Tick counter
        double t = 0;
        //Delta Time, defines the Frame Rate: dt = 1000 ms / FPS
        double dt = 1000.0/30.0;
        //Piece that the player controls, start as null value
        Piece P = B.getPiece();
        //Game loop. Exits only when a piece overflows the board, triggering a break
        while (true) {
            //Piece Checks
            //Piece Existence check (#WIP)
            if (P == null) {
                int rand_piece = ThreadLocalRandom.current().nextInt(1, 8);
                if (rand_piece == 1) {
                    //I Piece
                }
                else if (rand_piece == 2) {
                    //O Piece
                }
                else if (rand_piece == 3) {
                    //T Piece
                }
                else if (rand_piece == 4) {
                    //J Piece
                }
                else if (rand_piece == 5) {
                   //L Piece
                }
                else if (rand_piece == 6) {
                    //S Piece
                }
                else if (rand_piece == 7) {
                    //Z Piece
                }
            }
            //Overflown Check (Stoppage)
            if (CheckCollisionOver(P, B)) {
                break;
            }

            //Piece Side Movement
            // (#WIP) Needs Sniffer for User Input, only available when using Graphics

            //Piece Movement
            if (t % 4 == 0) {
                //If the piece collides with another, updates the landed matrix and clear piece
                if (CheckCollisionUnder(P, B)) {
                    B.UpdateLanded();
                    B.ClearPiece();
                }
                else {
                    B.ClearLastPiece();
                    //P.addY(); (#WIP)
                    B.UpdateBoard();
                }
            }

            //Check if there are any row Deletions to be made
            for (int i = 0; i < B.getHeight(); i++) {
                if (CheckRowCompletion(B, i))
                    B.DeleteLine(i);
            }

            //Engine Runtime Organization
            //Tick Updater
            t++;
            //Sleep Function to regulate the game run speed
            try {
                Thread.sleep((int) dt);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
