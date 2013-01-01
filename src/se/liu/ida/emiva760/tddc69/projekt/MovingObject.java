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

    public MovingObject(float YCoord, float XCoord, int YSize, int XSize,
                        float YVel, float XVel, SquareColor Color) {
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

    public float getYVel() {
        return YVel;
    }

    public float getXVel() {
        return XVel;
    }

    public void update() {
        this.setYCoord(this.getYCoord() + this.getYVel());
        this.setXCoord(this.getXCoord() + this.getXVel());
    }
}
