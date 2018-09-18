/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.actors;

import cz.mendelu.java.hra.trade.Market;
import java.awt.Graphics;
import cz.mendelu.java.merchantgame.GameManager;
import cz.mendelu.java.merchantgame.graphic.Images;
import cz.mendelu.java.merchantgame.states.StateManager;
import java.io.Serializable;
    
/**
 *
 * @author allc
 */
public class MarketActor extends EntityActor implements Serializable {

    private Market market = new Market();
    
    
    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 75;

    public MarketActor(GameManager gm) {
        super(gm);
        
        this.x = market.getPosition().getX();
        this.y = market.getPosition().getY();
        this.bounds.x=(int) market.getPosition().getX();
        this.bounds.y=(int) market.getPosition().getY();
        this.bounds.height=DEFAULT_HEIGHT;
        this.bounds.width=DEFAULT_WIDTH;
    }
    
    
    
    @Override
    public void update() {
        
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Images.market,(int) x,(int) y,DEFAULT_WIDTH,DEFAULT_HEIGHT, null);
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }
    
    
    
}
