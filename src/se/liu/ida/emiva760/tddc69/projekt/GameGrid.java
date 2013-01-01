package se.liu.ida.emiva760.tddc69.projekt;

import java.util.ArrayList;

/**
 * ===================
 * File: GameGrid.java
 * ===================
 *
 * The game grid on which to put the objects. Implemented as an array of
 * SquareColors.
 */

public class GameGrid {
    private final int ROWS = 30;
    private final int COLUMNS = 50;

    // create the play area
    private SquareColor[][] grid = new SquareColor[ROWS][COLUMNS];
    Paddle paddle = new Paddle(ROWS, COLUMNS/2, 2, 5);
    Ball ball = new Ball(ROWS-3,COLUMNS/2, 1,1,0,0,SquareColor.RED);

    public int getRows() {
    	return ROWS;
    }
    public int getColumns() {
    	return COLUMNS;
    }

    // Updates the game
    public void tick() {
        ball.update();
    }
}
