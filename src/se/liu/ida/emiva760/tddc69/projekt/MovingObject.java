package se.liu.ida.emiva760.tddc69.projekt;

// The moving objects
public class MovingObject extends GameObject {
    private int YSpeed;
    private int XSpeed;

    public MovingObject(int YCoord, int XCoord, int YSize, int XSize, int YSpeed, int XSpeed, char Color) {
        super(YCoord, XCoord, YSize, XSize, Color);
        this.YSpeed = YSpeed;
        this.XSpeed = XSpeed;
    }
}
