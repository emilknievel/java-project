package se.liu.ida.emiva760.tddc69.projekt;

/**
 * =================
 * File: Paddle.java
 * =================
 *
 * The paddle that the player controls.
 */
public class Paddle extends MovingObject {

    public Paddle(int YCoord, int XCoord, int YSize, int XSize) {
        super(YCoord, XCoord, YSize, XSize, 0, 0, SquareColor.WHITE);
    }
}
