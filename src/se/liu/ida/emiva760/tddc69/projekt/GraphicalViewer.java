package se.liu.ida.emiva760.tddc69.projekt;

import javax.swing.*;
import java.awt.*;

/**
 * ==========================
 * File: GraphicalViewer.java
 * ==========================
 *
 * Handles the graphics
 */
public class GraphicalViewer extends JComponent implements GridListener {
    private static final int ROWS = 540;
    private static final int COLUMNS = 960;
    private static final int BLOCKHEIGHT = ROWS / 20;
    private static final int BLOCKWIDTH = COLUMNS / 20;

    private final GameGrid game;

    public GraphicalViewer(GameGrid game) {
        this.game = game;
        game.addGridListener(this);
    }

    public Dimension getPreferredSize() {
        return new Dimension(COLUMNS,ROWS);
    }

    public void paintComponent(final Graphics g) {
        final Graphics2D g2 = (Graphics2D) g;
        paintBackground(g2);
        paintObjects(g2);
    }

    public void paintBackground(final Graphics2D g2) {
        g2.setColor(Color.WHITE);
        g2.fill(new Rectangle(0,0,COLUMNS,ROWS));
    }

    // =======================================================================
    // Tror att utritningsfelet ligger hos dessa två funktioner. Kolla!
    
    /*
    public void paintObjects(final Graphics2D g2) {
        for (int i = 0; i < game.getRows(); i++) {
            for (int j = 0; j < game.getColumns(); j++) {
                // om det finns ett objekt, rita ut det
                
            }
        }
    }
    */
    
    
    
    public void paintObjects(final Graphics2D g2) {
        for (int i = 0; i < game.getRows(); i++) {
            for (int j = 0; j < game.getColumns(); j++) {
                // Check if there is a GameObject
                if (game.staticObjExists(i, j)) {
                    g2.setColor(convertToColor(game.getSquareColor(i, j)));
                    int blockY = i*BLOCKHEIGHT;
                    int blockX = j*BLOCKWIDTH;
                    g2.fill(new Rectangle(blockX, blockY, BLOCKWIDTH, BLOCKHEIGHT));
                }
            }
        }
    }
    
    /*
    public void paintMovingObjects(final Graphics2D g2) {
        for (int i = 0; i < game.getRows(); i++) {
            for (int j = 0; j < game.getColumns(); j++) {
                // Check if there is a MovingObject
            }
        }
    }
    */
    
    /*
    public void paintObjects(final Graphics2D g2) {
        for (int i = 0; i < game.getRows(); i++) {
            for (int j = 0; j < game.getColumns(); j++) {
                if (game.getSquareColor(i, j) != null) {
                    g2.setColor(convertToColor(game.getSquareColor(i, j)));
                    int blockY = i*BLOCKHEIGHT;
                    int blockX = j*BLOCKWIDTH;
                    g2.fill(new Rectangle(blockX, blockY, BLOCKWIDTH, BLOCKHEIGHT));
                }
            }
        }
    }
    */
    

    public Color convertToColor(SquareColor color) {
        if (color == null) {
            return Color.WHITE;
        }
        switch (color) {
            case BLUE:
                return Color.BLUE;
            case RED:
                return Color.RED;
            case YELLOW:
                return Color.YELLOW;
            case GRAY:
                return Color.GRAY;
            case GREEN:
                return Color.GREEN;
            case ORANGE:
                return Color.ORANGE;
            case BLACK:
                return Color.BLACK;
            default:
                return Color.WHITE;
        }
    }
    
    
    // =======================================================================

    public void gridChanged() {
        this.repaint();
    }
}
