/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.actors;

import cz.mendelu.java.hra.world.Farm;
import java.awt.Graphics;
import java.awt.Rectangle;
import cz.mendelu.java.merchantgame.GameManager;
import cz.mendelu.java.merchantgame.graphic.Images;
import java.io.Serializable;

/**
 *
 * @author allc
 */
public class FarmActor extends EntityActor implements Serializable {

    private Farm farm = new Farm("Farm");
    
    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 75;
    
    public FarmActor(GameManager gm/*double x, double y*/) {
        super(gm);
        this.x = farm.getPosition().getX();
        this.y = farm.getPosition().getY();
        this.bounds.x=(int) farm.getPosition().getX();
        this.bounds.y=(int) farm.getPosition().getY();
        this.bounds.height=DEFAULT_HEIGHT;
        this.bounds.width=DEFAULT_WIDTH;
        
    }
    
    

    @Override
    public void update() {
    
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Images.farm,(int) x,(int) y,DEFAULT_WIDTH,DEFAULT_HEIGHT, null);
    }

    
    
    
    
    
    
}
