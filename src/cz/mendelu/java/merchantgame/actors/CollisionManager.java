/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.actors;

import java.awt.Rectangle;
import cz.mendelu.java.merchantgame.GameManager;
import cz.mendelu.java.merchantgame.worlds.Orbis;
import cz.mendelu.java.merchantgame.worlds.TownOrbis;
import java.io.Serializable;

/**
 *
 * @author allc
 */
public class CollisionManager implements Serializable {
    
    private TownOrbis town;
    

    public CollisionManager() {
        this.town = new TownOrbis(null);
        
    }
    
    public Rectangle farm() {
        return town.getFarm().getBounds();
    }
    
    public Rectangle foundry() {
        return town.getFoundry().getBounds();
    }
    
    public Rectangle sawmill() {
        return town.getSawmill().getBounds();
    }
    
    public Rectangle market() {
        return town.getMarket().getBounds();
    }
    
    
    
    
}
