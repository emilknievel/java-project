package se.liu.ida.emiva760.tddc69.projekt;

/**
 * =====================
 * File: GameObject.java
 * =====================
 *
 * Contains what's common for all objects in the game.
 */

public class GameObject {
    private float YCoord;
    private float XCoord;
    private int YSize;
    private int XSize;
    private SquareColor Color;

    public GameObject(float YCoord, float XCoord, int YSize, int XSize, SquareColor Color) {
        this.YCoord = YCoord;
        this.XCoord = XCoord;
        this.YSize = YSize;
        this.XSize = XSize;
        this.Color = Color;
    }

    public float getYCoord() {
        return YCoord;
    }

    public float getXCoord() {
        return XCoord;
    }

    public void setYCoord(float YCoord) {
        this.YCoord = YCoord;
    }

    public void setXCoord(float XCoord) {
        this.XCoord = XCoord;
    }
}
