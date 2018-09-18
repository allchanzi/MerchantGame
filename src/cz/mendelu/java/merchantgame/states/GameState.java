/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.states;

import java.awt.Graphics;
import java.io.Serializable;
import cz.mendelu.java.merchantgame.GameManager;
import cz.mendelu.java.merchantgame.LoadGame;
import cz.mendelu.java.merchantgame.SaveGame;

import cz.mendelu.java.merchantgame.actors.PlayerActor;
import cz.mendelu.java.merchantgame.worlds.TownOrbis;

/**
 *
 * @author allc
 */
public class GameState extends State implements Serializable {

    
    private PlayerActor player;
    private TownOrbis world;

    
    

    public GameState(GameManager gm) {
        super(gm);
        world = new TownOrbis(gm);
        gm.setOrbis(world);
        player = new PlayerActor(gm);
       
        
        
    }
    @Override
    public void keyInput() {
        
        if(gm.getKeyManager().esc){
            StateManager.setState(gm.menuState());        
        }
        if(gm.getKeyManager().save){
           SaveGame.save(player.getPlayer(), world.getMarket().getMarket());
        }
        if(gm.getKeyManager().load){
            this.world.getMarket().setMarket(LoadGame.loadMarket());
            this.player.setPlayer(LoadGame.loadPlayer());
        }    
    }
    
    public void mouseInput(){
        if(this.getWorld().getMarket().getBounds().contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
            StateManager.setState(gm.marketState());
        if(gm.getMouseManager().click)
         gm.getMouseManager().click = false;
    }
    
    @Override
    public void update() {
        keyInput();
        mouseInput();
        world.update();
        player.update();
        
         
        
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        player.render(g);
        
    }

    public PlayerActor getPlayer() {
        return player;
    }

    public TownOrbis getWorld() {
        return world;
    }

    
    
    
    
    

    
    
}
