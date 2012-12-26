package se.liu.ida.emiva760.tddc69.projekt;

/**
 * ===================
 * File: GameTest.java
 * ===================
 *
 * Tests different aspects of the game, such as drawing methods, placement
 * and physics.
 */

public class GameTest {
    public static void main(String[] args) {
	    // Test the coordinates
        GameGrid area = new GameGrid();
	    Paddle paddle = new Paddle(area.getRows(), area.getColumns()/2, 2, 5);
        Brick brick = new Brick(0,0,3,6,SquareColor.YELLOW);
        Ball ball = new Ball(area.getRows()-3,area.getColumns()/2, 1,1,0,0,SquareColor.RED);
        Power power = new Power(area.getRows()/2, area.getColumns()/2, 2,2,0,0,SquareColor.BLUE);

        System.out.println("----------Paddle coords----------");
        System.out.println("X: " + paddle.getXCoord());
        System.out.println("Y: " + paddle.getYCoord());
        System.out.println("XVel: " + paddle.getXVel());
        System.out.println("YVel: " + paddle.getYVel());

        System.out.println("----------Brick coords-----------");
        System.out.println("X: " + brick.getXCoord());
        System.out.println("Y: " + brick.getYCoord());

        System.out.println("----------Ball coords------------");
        System.out.println("X: " + ball.getXCoord());
        System.out.println("Y: " + ball.getYCoord());
        System.out.println("XVel: " + ball.getXVel());
        System.out.println("YVel: " + ball.getYVel());

        System.out.println("----------Power coords-----------");
        System.out.println("X: " + power.getXCoord());
        System.out.println("Y: " + power.getYCoord());
        System.out.println("XVel: " + power.getXVel());
        System.out.println("YVel: " + power.getYVel());
	
	    // Test the drawing methods
	
	
        // Test the physics
	
	
    }
}
