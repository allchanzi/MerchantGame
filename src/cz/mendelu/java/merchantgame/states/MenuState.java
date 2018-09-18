/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.states;

import java.awt.Graphics;
import cz.mendelu.java.merchantgame.Game;
import cz.mendelu.java.merchantgame.GameManager;
import cz.mendelu.java.merchantgame.LoadGame;
import cz.mendelu.java.merchantgame.SaveGame;
import cz.mendelu.java.merchantgame.graphic.Images;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

/**
 *
 * @author allc
 */
public class MenuState extends State {

    private String[] options = {"Game","Load","Save", "Exit"};
    private int currentSelection = 0;
    
    private Rectangle gameButton, loadButton, saveButton, exitButton;
    
    public MenuState(GameManager gm) {
        super(gm);
        
        gameButton = new Rectangle(gm.getWidth()/2 - 100, gm.getHeight()/2 - 200, 200, 50);
        loadButton = new Rectangle(gm.getWidth()/2 - 100, gm.getHeight()/2 - 100, 200, 50);
        saveButton = new Rectangle(gm.getWidth()/2 - 100, gm.getHeight()/2 , 200, 50);
        exitButton = new Rectangle(gm.getWidth()/2 - 100, gm.getHeight()/2 + 100, 200, 50);
    }
    
    public void mouseInput(){
 
        if(gameButton.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY())){
            currentSelection = 0;
            if(gm.getMouseManager().click)
                StateManager.setState(gm.gameState());
                gm.getMouseManager().click = false;
        }
        if(loadButton.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY())){
            currentSelection = 1; 
            if(gm.getMouseManager().click){
                gm.gameState()
                        .getPlayer()
                        .setPlayer(LoadGame.loadPlayer());
                gm.gameState()
                        .getWorld()
                        .getMarket()
                        .setMarket(LoadGame.loadMarket());
                StateManager.setState(gm.gameState());
                gm.getMouseManager().click = false;
            }
        }    
        if(saveButton.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY())){
            currentSelection = 2;
            if(gm.getMouseManager().click)
                SaveGame.save(gm.gameState().getPlayer().getPlayer(),gm.gameState().getWorld().getMarket().getMarket());
                gm.getMouseManager().click = false;
        }
        if(exitButton.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY())){
            currentSelection = 3;
            if(gm.getMouseManager().click)
                System.exit(1);
                gm.getMouseManager().click = false;
         }
        if(gm.getMouseManager().click)
         gm.getMouseManager().click = false;
    }
      
    @Override
    public void update() {
        mouseInput();
        
         
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Images.world, 0, 0, gm.getWidth(), gm.getHeight(), null);
        g.drawImage(Images.menubutton, gm.getWidth()/2 - 100, gm.getHeight()/2 - 100, 200, 50,null);
        g.drawImage(Images.menubutton,gm.getWidth()/2 - 100, gm.getHeight()/2 , 200, 50,null);
        g.drawImage(Images.menubutton,gm.getWidth()/2 - 100, gm.getHeight()/2 + 100, 200, 50,null);
        g.drawImage(Images.menubutton,gm.getWidth()/2 - 100, gm.getHeight()/2 - 200, 200, 50,null);
        //Vykreslenie napisov
        for (int i=0; i<options.length; i++ ) {   
        if(i == currentSelection) {
            g.setColor(Color.red);
        } else {
            g.setColor(Color.black);
        }
        
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString(options[i], gm.getWidth() / 2 - 70, 135 + i *100);
        
    }
    }

    @Override
    public void keyInput() {
        
    }

    
    
}
