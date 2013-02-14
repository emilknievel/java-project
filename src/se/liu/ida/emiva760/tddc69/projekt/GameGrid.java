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
    private int rows = 30;
    private int columns = 50;
    private final ArrayList<GridListener> GridListenerList;

    // create the play area
    private SquareColor[][] grid = new SquareColor[rows][columns];
    Paddle paddle = new Paddle(rows-3, columns/2, 2, 5);
    Ball ball = new Ball(rows-5,columns/2, 1,1,-1,0,SquareColor.RED);

    /***************************************************************
    Place function to create the blocks here:

    placeBlocks(COLUMNS);
     ***************************************************************/

    public GameGrid(int rows, int columns) {
        this.GridListenerList = new ArrayList<>();
        this.rows = rows;
        this.columns = columns;
    }

    public int getRows() {
    	return rows;
    }
    public int getColumns() {
    	return columns;
    }

    public SquareColor getSquareColor(int row, int column) {
        return grid[row][column];
    }

    // Updates the game
    public void tick() {
        ball.update();
        notifyListeners();
    }

    public void addGridListener(GridListener gl) {
        GridListenerList.add(gl);
    }

    private void notifyListeners() {
        for (GridListener gl : GridListenerList) {
            gl.gridChanged();
        }
    }

    // Game over if the ball hits the bottom of the screen
    public boolean failState() {
        return ball.getYCoord() == getRows();
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
