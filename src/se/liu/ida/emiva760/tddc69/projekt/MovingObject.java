package se.liu.ida.emiva760.tddc69.projekt;

// The moving objects
public class MovingObject extends GameObject {
    private int YSpeed;
    private int XSpeed;

    // Check whats wrong
    public MovingObject(int YCoord, int XCoord, int YSize, int XSize, int YSpeed, int XSpeed) {
        super(YCoord, XCoord, YSize, XSize);
        this.YSpeed = YSpeed;
        this.XSpeed = XSpeed;
    }
}
