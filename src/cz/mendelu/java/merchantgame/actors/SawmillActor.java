/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.actors;

import cz.mendelu.java.hra.world.Sawmill;
import java.awt.Graphics;
import cz.mendelu.java.merchantgame.GameManager;
import cz.mendelu.java.merchantgame.graphic.Images;

/**
 *
 * @author allc
 */
public class SawmillActor extends EntityActor {

    private Sawmill sawmill = new Sawmill("Sawmill");
    
    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 75;
    
    public SawmillActor(GameManager gm/*double x, double y*/) {
        super(gm);
        this.x = sawmill.getPosition().getX();
        this.y = sawmill.getPosition().getY();
        this.bounds.x=(int) sawmill.getPosition().getX();
        this.bounds.y=(int) sawmill.getPosition().getY();
        this.bounds.height=DEFAULT_HEIGHT;
        this.bounds.width=DEFAULT_WIDTH;
    }

    @Override
    public void update() {
    
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Images.sawmill,(int) x,(int) y,DEFAULT_WIDTH,DEFAULT_HEIGHT, null);
    }
    
}
