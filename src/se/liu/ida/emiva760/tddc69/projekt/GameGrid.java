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
    private final ArrayList<GridListener> GridListenerList = new ArrayList<GridListener>();

    // create the play area
    private SquareColor[][] grid = new SquareColor[ROWS][COLUMNS];
    Paddle paddle = new Paddle(ROWS, COLUMNS/2, 2, 5);
    Ball ball = new Ball(ROWS-3,COLUMNS/2, 1,1,0,0,SquareColor.RED);

    /***************************************************************
    Place function to create the blocks here:

    placeBlocks(COLUMNS);
     ***************************************************************/

    public int getRows() {
    	return ROWS;
    }
    public int getColumns() {
    	return COLUMNS;
    }

    public SquareColor getSquareColor(int row, int column) {
        return grid[row][column];
    }

    // Updates the game
    public void tick() {
        ball.update();
    }

    public void addGridListener(GridListener gl) {
        GridListenerList.add(gl);
    }

    /*
    Puts a new batch of blocks on top of the screen:

    public void placeBlocks(number_of_columns) {
        Create blocks. The number of blocks is based on the number of columns
        The type of block is controlled by a random number. Normal block is
        the type most likely to be placed...
    }
     */
}
