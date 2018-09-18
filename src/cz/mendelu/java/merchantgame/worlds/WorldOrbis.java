/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.worlds;

import java.awt.Graphics;
import cz.mendelu.java.merchantgame.Game;
import cz.mendelu.java.merchantgame.GameManager;
import cz.mendelu.java.merchantgame.actors.FarmActor;
import cz.mendelu.java.merchantgame.actors.FoundryActor;
import cz.mendelu.java.merchantgame.actors.MarketActor;
import cz.mendelu.java.merchantgame.actors.SawmillActor;
import cz.mendelu.java.merchantgame.graphic.Images;

/**
 *
 * @author allc
 */
public class WorldOrbis implements Orbis {
        GameManager gm;
    public WorldOrbis(GameManager gm) {
        this.gm = gm;
    }
    
    

    @Override
    public void update() {
        
    }

    @Override
    public void render(Graphics g) {
     g.drawImage(Images.world, 0, 0,gm.getWidth(),gm.getHeight(), null);
    }

    @Override
    public void loadWorld(Graphics g) {
    
    }

    
    
}
