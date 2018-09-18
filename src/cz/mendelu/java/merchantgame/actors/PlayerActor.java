/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.actors;

import cz.mendelu.java.hra.merchant.Merchant;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.io.Serializable;
import cz.mendelu.java.merchantgame.Game;
import cz.mendelu.java.merchantgame.GameManager;


import cz.mendelu.java.merchantgame.graphic.Images;



/**
 *
 * @author allc
 */
public class PlayerActor extends EntityActor implements Serializable{
    private static final int DEFAULT_WIDTH = 20;
    private static final int DEFAULT_HEIGHT = 20;
    private static final float DEFAULT_SPEED = 1;
    private String direction = "up";
    
    
    
    double x,y;
    Merchant player = new Merchant(100);
    CollisionManager cm = new CollisionManager();
    
    
    
    private boolean collUp = false, collDown = false, collRight = false, collLeft = false;

    public PlayerActor(GameManager gm) {
        super(gm);
        
        this.x = player.getPosition().getX();
        this.y = player.getPosition().getY();
       
        
    }
  
    private void keyInput(){
       if(gm.getKeyManager().player)
           this.getPlayer().getCurrency().earn(1000);
       
       if(!collision()){
        if(gm.getKeyManager().up){
            player.getPosition().move(0,-DEFAULT_SPEED); 
            direction = "up";
        }
        if(gm.getKeyManager().down){
            player.getPosition().move(0,DEFAULT_SPEED); 
            direction = "down";
        }
        if(gm.getKeyManager().left){
            player.getPosition().move(-DEFAULT_SPEED,0);
            direction = "left";
        }
        if(gm.getKeyManager().right){
            player.getPosition().move(DEFAULT_SPEED,0);
            direction = "right";
        }
        
       }
       else {
        if (collUp == true) {
            player.getPosition().move(0, DEFAULT_SPEED ); 
            collUp = false;
            System.out.println("up");
        }
        if (collLeft == true) {
            player.getPosition().move(DEFAULT_SPEED,0);
            collLeft = false;
            System.out.println("left");
        }
        if (collRight == true) {
            player.getPosition().move(-DEFAULT_SPEED,0);
            collRight = false;
            System.out.println("right");
        }
        if (collDown == true) {
            player.getPosition().move(0, -DEFAULT_SPEED ); 
            collDown = false;
            System.out.println("down");
        }
       
       } 
    }
    
    
    private void move(){
        this.x = player.getPosition().getX();
        this.y = player.getPosition().getY();
       
        
    }
    
    private boolean collision(){
        double px = player.getPosition().getX();
        double py = player.getPosition().getY();
        
                
      //farm
        //horna hranca a dolna hranica
        if ((px>cm.farm().x) && (px<cm.farm().x+cm.farm().width)) {
            if (py==cm.farm().y) {
                collDown = true; 
                System.out.println("down");
                return true;
               
            }else if (py==cm.farm().y+cm.farm().height){
                collUp = true;
                return true;
            }
        }
        //prava a lava
        if ((py>cm.farm().y) && (py<cm.farm().y+cm.farm().height)) {
            if(px ==cm.farm().x) {
                collRight = true;
                return true;
            }
            if (px ==cm.farm().x+cm.farm().width) {
                collLeft = true;                
                return true;
            }
        }
      
        //foundry
            //horna hranca a dolna hranica
        if ((px>cm.foundry().x) && (px<cm.foundry().x+cm.foundry().width)) {
            if (py==cm.foundry().y) {
                collDown = true; 
                return true;
            } else if (py==cm.foundry().y+cm.foundry().height){
                collUp = true;
                return true;
            }
        }
        //prava a lava
        if ((py>cm.foundry().y) && (py<cm.foundry().y+cm.foundry().height)){
            if(px == cm.foundry().x){
                collRight = true;
                return true;
            } else if (px == cm.foundry().x+cm.foundry().width){
                collLeft = true;
                return true;
            }
        }
        
        //sawmill
            //horna hranca a dolna hranica
        if ((px>cm.sawmill().x) && (px<cm.sawmill().x+cm.sawmill().width)) {
            if (py == cm.sawmill().y) {
                collDown = true; 
                return true;
            } else if (py == cm.sawmill().y+cm.sawmill().height){
                collUp = true;
                return true;
            }
        }
        //prava a lava
        if ((py>cm.sawmill().y) && (py<cm.sawmill().y+cm.sawmill().height)){
            if(px == cm.sawmill().x){
                collRight = true;                
                return true;
            } else if (px == cm.sawmill().x+cm.sawmill().width){
                collLeft = true;
                return true;
            }
        }
        
        //market
            //horna hranca a dolna hranica
        if ((px>cm.market().x) && (px<cm.market().x+cm.market().width)) {
            if (py == cm.market().y) {
                collDown = true; 
                return true;
            } else if (py == cm.market().y+cm.market().height){
                collUp = true;
                return true;
            }
        }
        //prava a lava
        if ((py>cm.market().y) && (py<cm.market().y+cm.market().height)){
            if(px == cm.market().x){
                collRight = true;
                return true;
            } else if (px == cm.market().x+cm.market().width){
                collLeft = true;
                return true;
            }
        }
     
       //hranice  
      if (py< 0) {
          collUp = true;
          return true;
      }
      if (px< 0) {
          collLeft = true;
          return true;
      }
      if (px + DEFAULT_WIDTH> gm.getWidth()) {
          collRight = true;
          return true;
      }
      if (py + DEFAULT_WIDTH> gm.getHeight()) {
          collDown = true;
          return true;
      }
        return false; 
                
    }
    
    ////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
        
       
    @Override
    public void update() {
        keyInput();
        move();
        
        
        
    }

    @Override
    public void render(Graphics g) {
        switch (direction){
           case "up" :  g.drawImage(Images.playerUp,(int) (x-gm.getGameCamera().getxOffset() ),
                        (int) (y -gm.getGameCamera().getyOffset()),DEFAULT_WIDTH,DEFAULT_HEIGHT, null); 
                        break;  
           case "down" :  g.drawImage(Images.playerDown,(int) (x-gm.getGameCamera().getxOffset() ),
                        (int) (y -gm.getGameCamera().getyOffset()),DEFAULT_WIDTH,DEFAULT_HEIGHT, null); 
                        break; 
           case "right" :  g.drawImage(Images.playerRight,(int) (x-gm.getGameCamera().getxOffset() ),
                        (int) (y -gm.getGameCamera().getyOffset()),DEFAULT_WIDTH,DEFAULT_HEIGHT, null); 
                        break; 
           case "left" :  g.drawImage(Images.playerLeft,(int) (x-gm.getGameCamera().getxOffset() ),
                        (int) (y -gm.getGameCamera().getyOffset()),DEFAULT_WIDTH,DEFAULT_HEIGHT, null); 
                        break; 
        }
            
                
        
      g.drawString(String.valueOf(this.getPlayer().getCurrency().getValue()), 100, 14);
        
        
        
        
    }
    
    
    ////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////

    public Merchant getPlayer() {
        return player;
    }

    public void setPlayer(Merchant player) {
        this.player = player;
    }
    
    
    
    
    
    
    
}
