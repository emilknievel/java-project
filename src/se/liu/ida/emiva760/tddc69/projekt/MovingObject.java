package se.liu.ida.emiva760.tddc69.projekt;

/**
 * =======================
 * File: MovingObject.java
 * =======================
 *
 * The moving objects.
 * I'm at the moment considerig using vectors to control the movement.
 */

public class MovingObject extends GameObject {
    private int YSpeed;
    private int XSpeed;

    public MovingObject(int YCoord, int XCoord, int YSize, int XSize, int YSpeed, int XSpeed, char Color) {
        super(YCoord, XCoord, YSize, XSize, Color);
        this.YSpeed = YSpeed;
        this.XSpeed = XSpeed;
    }
}
