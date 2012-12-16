package se.liu.ida.emiva760.tddc69.projekt;

import java.util.ArrayList;

/**
 * The game grid on which to put the objects
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
