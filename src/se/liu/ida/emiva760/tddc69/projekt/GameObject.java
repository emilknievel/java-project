package se.liu.ida.emiva760.tddc69.projekt;

/**
 * =====================
 * File: GameObject.java
 * =====================
 *
 * Contains what's common for all objects in the game.
 */

public class GameObject {
    private int YCoord;
    private int XCoord;
    private int YSize;
    private int XSize;
    private SquareColor Color;

    public GameObject(int YCoord, int XCoord, int YSize, int XSize, SquareColor Color) {
        this.YCoord = YCoord;
        this.XCoord = XCoord;
        this.YSize = YSize;
        this.XSize = XSize;
        this.Color = Color;
    }
}
