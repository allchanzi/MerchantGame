/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.worlds;

import cz.mendelu.java.hra.world.Town;
import java.awt.Graphics;
import java.io.Serializable;
import cz.mendelu.java.merchantgame.Game;
import cz.mendelu.java.merchantgame.GameManager;

import cz.mendelu.java.merchantgame.actors.FarmActor;
import cz.mendelu.java.merchantgame.actors.FoundryActor;
import cz.mendelu.java.merchantgame.actors.MarketActor;
import cz.mendelu.java.merchantgame.actors.SawmillActor;
import cz.mendelu.java.merchantgame.graphic.Images;
import cz.mendelu.java.merchantgame.states.State;

/**
 *
 * @author allc
 */
public class TownOrbis implements Orbis, Serializable  {
 
    GameManager gm;
    Town town = Town.modelTown();
    SawmillActor sawmill;
    FarmActor farm;
    FoundryActor foundry;
    MarketActor market;

    public TownOrbis(GameManager gm) {
        this.gm = gm;
        sawmill = new SawmillActor(gm);
        farm = new FarmActor(gm);
        foundry = new FoundryActor(gm);
        market = new MarketActor(gm);
    }
    
    
    
    @Override
    public void update() {
        
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Images.town, 0,0,gm.getWidth(),gm.getHeight(), null);
        loadWorld(g);
        
    }

    @Override
    public void loadWorld(Graphics g) {
        sawmill.render(g);
        farm.render(g);
        foundry.render(g);
        market.render(g);
     
    }

    public SawmillActor getSawmill() {
        return sawmill;
    }

    public FarmActor getFarm() {
        return farm;
    }

    public FoundryActor getFoundry() {
        return foundry;
    }

    public MarketActor getMarket() {
        return market;
    }
    
    
    
    
    
    
    
}
