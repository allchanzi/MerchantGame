/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.states;

import cz.mendelu.java.hra.merchant.StorageSpaceException;
import java.awt.Graphics;
import java.io.Serializable;
import java.util.logging.Handler;
import cz.mendelu.java.merchantgame.Game;
import cz.mendelu.java.merchantgame.GameManager;
import cz.mendelu.java.merchantgame.actors.PlayerActor;
import cz.mendelu.java.merchantgame.graphic.Images;
import cz.mendelu.java.merchantgame.worlds.TownOrbis;

/**
 *
 * @author allc
 */
public abstract class State implements Serializable  {
    
    protected GameManager gm;

    public State(GameManager gm) {
        this.gm = gm;
    }
    
    
    public abstract void keyInput();
    public abstract void mouseInput()throws StorageSpaceException;
    public abstract void update();
    public abstract void render(Graphics g);
    public PlayerActor getPlayer() {
        return this.getPlayer();
    }
    public TownOrbis getWorld() {
        return this.getWorld();
    }

   
}
