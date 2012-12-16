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

    public int getRows() {
    	return ROWS;
    }
    public int getColumns() {
    	return COLUMNS;
    }
}
