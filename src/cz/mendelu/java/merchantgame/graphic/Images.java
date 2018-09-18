/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.graphic;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


/**
 *
 * @author allc
 */
public class Images {

    public static BufferedImage playerUp,playerDown,playerLeft,playerRight, world, town, foundry, sawmill, farm, market,menubutton,buildingPanel;

    
        
        
           public Images(){ 
        try { 
            buildingPanel =ImageIO.read(new File("res/images/buildingmenu.jpg"));
            playerUp =ImageIO.read(new File("res/images/merchantUp.png"));
            playerDown =ImageIO.read(new File("res/images/merchantDown.png"));
            playerLeft =ImageIO.read(new File("res/images/merchantLeft.png"));
            playerRight =ImageIO.read(new File("res/images/merchantRight.png"));
            world = ImageIO.read(new File("res/images/world.jpg"));
            town = ImageIO.read(new File("res/images/city.jpg"));
            foundry = ImageIO.read(new File("res/images/foundry.png"));
            sawmill = ImageIO.read(new File("res/images/sawmill.png"));
            farm = ImageIO.read(new File("res/images/farm.png"));
            market = ImageIO.read(new File("res/images/market.png"));
            menubutton = ImageIO.read(new File("res/images/menubutton.jpg"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
           }
           
           
           
           

    public static BufferedImage getPlayerUp() {
        return playerUp;
    }

    public static BufferedImage getPlayerDown() {
        return playerDown;
    }

    public static BufferedImage getPlayerLeft() {
        return playerLeft;
    }

    public static BufferedImage getPlayerRight() {
        return playerRight;
    }
        
       
    

    

    public BufferedImage getWorld() {
        return world;
    }

    public BufferedImage getTown() {
        return town;
    }

    public BufferedImage getFoundry() {
        return foundry;
    }

    public BufferedImage getSawmill() {
        return sawmill;
    }

    public BufferedImage getFarm() {
        return farm;
    }
    
    
    
    
    
    
    
}
