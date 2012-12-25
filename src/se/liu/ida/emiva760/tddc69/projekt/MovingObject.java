package se.liu.ida.emiva760.tddc69.projekt;

/**
 * =======================
 * File: MovingObject.java
 * =======================
 *
 * The moving objects.
 * I'm at the moment considering using vectors to control the movement.
 */

public class MovingObject extends GameObject {
    private float YVel;
    private float XVel;

    public MovingObject(int YCoord, int XCoord, int YSize, int XSize, float YVel, float XVel, SquareColor Color) {
        super(YCoord, XCoord, YSize, XSize, Color);
        this.YVel = YVel;
        this.XVel = XVel;
    }

    public void setYVel(float YVel) {
        this.YVel = YVel;
    }

    public void setXVel(float XVel) {
        this.XVel = XVel;
    }
}
