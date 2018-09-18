/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.actors;

import java.awt.Graphics;
import java.awt.Rectangle;
import cz.mendelu.java.merchantgame.GameManager;
import java.io.Serializable;

/**
 *
 * @author allc
 */
public abstract class EntityActor implements Serializable {
    
    protected double x, y;
    protected int width, height;
    protected GameManager gm;
    protected Rectangle bounds;

    public EntityActor(GameManager gm/*double x, double y*/) {
        //this.x = x;
        //this.y = y;
        this.gm=gm;
        
        bounds = new Rectangle(0,0, width, height);
    }
    
    public abstract void update();
    public abstract void render(Graphics g);
    
    public Rectangle getBounds() {
        return this.bounds;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
}
