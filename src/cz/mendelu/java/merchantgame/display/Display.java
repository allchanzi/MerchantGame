/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.display;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author allc
 */
public class Display {
    //Vytvory okono
    private JFrame frame;
    //Nahráva grafiku ktoru pomocou JFram-u zobrazime v okne
    private Canvas canvas;
    private int width, height;
    private String title;
    
    public Display(int width, int height, String title){
        this.width = width;
        this.height = height;
        this.title = title;
        createJFrame();
        
    }

    //Vytvory okno
    private void createJFrame() {
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
       createCanvas();
        frame.add(canvas);
        frame.pack();
    }
    //Vytvory canvas
    private void createCanvas() {
        canvas = new Canvas();
        canvas.setSize(new Dimension(width,height));
        canvas.setMaximumSize(new Dimension(width,height));
        canvas.setMinimumSize(new Dimension(width,height));
        canvas.setFocusable(false);
        canvas.requestFocus();
               
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public JFrame getFrame() {
        return frame;
    }
    
    
    
    
}
