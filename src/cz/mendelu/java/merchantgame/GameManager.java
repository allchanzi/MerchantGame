/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame;

import cz.mendelu.java.merchantgame.graphic.GameCamera;
import cz.mendelu.java.merchantgame.input.KeyManager;
import cz.mendelu.java.merchantgame.input.MouseManager;
import cz.mendelu.java.merchantgame.states.State;
import cz.mendelu.java.merchantgame.worlds.Orbis;

/**
 *
 * @author allc
 */
public class GameManager {
    
    private Game game;
    private Orbis orbis;
    
    public GameCamera getGameCamera(){
        return game.getGameCamera();
    }

    public GameManager(Game game) {
        this.game = game;
    }
    
    public KeyManager getKeyManager(){
        return game.getKeyManager();
    }
    
    public int getWidth(){
        return game.getWidth();
    }
    
    public int getHeight(){
        return game.getHeight();
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Orbis getOrbis() {
        return orbis;
    }

    public void setOrbis(Orbis orbis) {
        this.orbis = orbis;
    }
    
    public State gameState(){
        return game.getGameState();
    }
    
    public State menuState(){
        return game.getMenuState();
    }
    
    public State marketState(){
        return game.getMarketState();
    }
    
    public MouseManager getMouseManager(){
        return game.getMouseManager();
    }
    
    
    
    
}
