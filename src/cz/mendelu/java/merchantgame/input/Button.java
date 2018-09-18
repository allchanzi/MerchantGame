/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.input;

import java.awt.Rectangle;

/**
 *
 * @author allc
 */
public abstract class Button extends Rectangle {
    
    protected String s;
    
    public Button(int x, int y, int width, int height, String s) {
        super(x, y, width, height);
        this.s = s;
    }
    
    public abstract int getValue();

    
}
