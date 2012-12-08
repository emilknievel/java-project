package se.liu.ida.emiva760.tddc69.projekt;

// Contains all things that are common for all game objects
public class GameObject {
    private int YCoord;
    private int XCoord;
    private int YSize;
    private int XSize;
    private char ObjectType; //b = brick, m = moving (ball, paddle)

    public GameObject(int YCoord, int XCoord, int YSize, int XSize, char ObjectType) {
        this.YCoord = YCoord;
        this.XCoord = XCoord;
        this.YSize = YSize;
        this.XSize = XSize;
        this.ObjectType = ObjectType;
    }
}
