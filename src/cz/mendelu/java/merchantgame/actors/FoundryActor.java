/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.actors;

import cz.mendelu.java.hra.world.Foundry;
import java.awt.Graphics;
import cz.mendelu.java.merchantgame.GameManager;
import cz.mendelu.java.merchantgame.graphic.Images;

/**
 *
 * @author allc
 */
public class FoundryActor extends EntityActor {

    private Foundry foundry = new Foundry("Foundry");
    
    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 75;
    
    public FoundryActor(GameManager gm/*double x, double y*/) {
        super(gm);
        this.x = foundry.getPosition().getX();
        this.y = foundry.getPosition().getY();
        this.bounds.x=(int) foundry.getPosition().getX();
        this.bounds.y=(int) foundry.getPosition().getY();
        this.bounds.height=DEFAULT_HEIGHT;
        this.bounds.width=DEFAULT_WIDTH;
    }

    @Override
    public void update() {
    
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Images.foundry,(int) x,(int) y,DEFAULT_WIDTH,DEFAULT_HEIGHT, null);
    }
    
}
