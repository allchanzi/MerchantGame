/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.menu;

import cz.mendelu.java.merchantgame.GameManager;
import cz.mendelu.java.merchantgame.graphic.Images;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author allc
 */
public class PlayerStats {

    private GameManager gm;
    
    public PlayerStats(GameManager gm) {
        this.gm=gm;
    }
    
    public void update(){
        
    }
    
    public void render(Graphics g){
        g.drawImage(Images.buildingPanel, 0, 0, gm.getWidth(), gm.getHeight()/4, null);
        g.drawImage(Images.playerRight, 30, 30, 60, 60, null);
        
        //DRAW CURRENCY
            g.drawImage(Images.menubutton, 120, 30, 100, 25, null);
            g.drawImage(Images.menubutton, 220, 30, 100, 25, null);
            g.drawString(String.valueOf(gm.gameState()
                                          .getPlayer()
                                          .getPlayer()
                                          .getCurrency()
                                          .getValue()), 230, 50);
            g.drawString("Currency: ", 130, 50);
             
            
            
           
    }
    
}
