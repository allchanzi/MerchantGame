/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.worlds;

import java.awt.Graphics;
import cz.mendelu.java.merchantgame.actors.FarmActor;
import cz.mendelu.java.merchantgame.actors.FoundryActor;
import cz.mendelu.java.merchantgame.actors.MarketActor;
import cz.mendelu.java.merchantgame.actors.SawmillActor;

/**
 *
 * @author allc
 */
public interface Orbis {
    public void update();
    public void render(Graphics g);
    public void loadWorld(Graphics g);
    
    
    
     
}
