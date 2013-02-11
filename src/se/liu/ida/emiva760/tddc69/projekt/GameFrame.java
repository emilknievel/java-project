package se.liu.ida.emiva760.tddc69.projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ====================
 * File: GameFrame.java
 * ====================
 */
public class GameFrame extends JFrame {
    private final GameGrid game;
    private GraphicalViewer graphics;

    public GameFrame(final GameGrid game) {
        super("Breakout");
        this.game = game;

        createGUI();
        createMenu();
        pack();
        setVisible(true);

        //Add actions
    }

    private void createGUI() {
        setLayout(new BorderLayout());
        graphics = new GraphicalViewer(this.game);
        add(graphics,BorderLayout.CENTER);
        graphics.repaint();
    }

    private void createMenu() {
        final JMenu theMenu = new JMenu("Menu");

        final JMenuItem theExit = new JMenuItem("Exit");
        theMenu.add(theExit);
        theExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirmExit = JOptionPane.showConfirmDialog(null,
                        "Do you really want to quit?","Confirm exit",
                        JOptionPane.YES_NO_OPTION);
                if (confirmExit == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        final JMenuBar theBar = new JMenuBar();
        theBar.add(theMenu);
        setJMenuBar(theBar);
    }
}
