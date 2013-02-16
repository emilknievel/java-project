package se.liu.ida.emiva760.tddc69.projekt;

import javax.swing.*;
import java.awt.event.ActionEvent;

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
        final GameGrid area = new GameGrid(30, 50);
        final GameFrame gameFrame = new GameFrame(area);

        final Action doOneStep = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Gå ett steg i spelet
                if (!area.failState()) {
                    area.tick();

                    System.out.println("----------Paddle coords----------");
                    System.out.println("X: " + area.paddle.getXCoord());
                    System.out.println("Y: " + area.paddle.getYCoord());
                    System.out.println("XVel: " + area.paddle.getXVel());
                    System.out.println("YVel: " + area.paddle.getYVel());

                    System.out.println("----------Ball coords------------");
                    System.out.println("X: " + area.ball.getXCoord());
                    System.out.println("Y: " + area.ball.getYCoord());
                    System.out.println("XVel: " + area.ball.getXVel());
                    System.out.println("YVel: " + area.ball.getYVel());

                } else {
                    System.out.println("You failed!");
                    System.exit(0);
                }
            }
        };

        final Timer clockTimer = new Timer(300, doOneStep);
        clockTimer.setCoalesce(true);
        clockTimer.start();

        clockTimer.setLogTimers(true);

        /*
	    Paddle paddle = new Paddle(area.getRows(), area.getColumns()/2, 2, 5);
        Brick brick = new Brick(0,0,3,6,SquareColor.YELLOW);
        Ball ball = new Ball(area.getRows()-3,area.getColumns()/2, 1,1,0,0,SquareColor.RED);
        Power power = new Power(area.getRows()/2, area.getColumns()/2, 2,2,0,0,SquareColor.BLUE);
        */

        /*
        System.out.println("----------Paddle coords----------");
        System.out.println("X: " + area.paddle.getXCoord());
        System.out.println("Y: " + area.paddle.getYCoord());
        System.out.println("XVel: " + area.paddle.getXVel());
        System.out.println("YVel: " + area.paddle.getYVel());
        */

        /*
        System.out.println("----------Brick coords-----------");
        System.out.println("X: " + brick.getXCoord());
        System.out.println("Y: " + brick.getYCoord());
        */

        /*
        System.out.println("----------Ball coords------------");
        System.out.println("X: " + area.ball.getXCoord());
        System.out.println("Y: " + area.ball.getYCoord());
        System.out.println("XVel: " + area.ball.getXVel());
        System.out.println("YVel: " + area.ball.getYVel());
        */

        /*
        System.out.println("----------Power coords-----------");
        System.out.println("X: " + power.getXCoord());
        System.out.println("Y: " + power.getYCoord());
        System.out.println("XVel: " + power.getXVel());
        System.out.println("YVel: " + power.getYVel());
        */
	
	    // Test the drawing methods

	
        // Test the physics


    }
}
