/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.states;

import cz.mendelu.java.hra.merchant.StorageSpaceException;
import cz.mendelu.java.hra.trade.Goods;
import cz.mendelu.java.hra.trade.Market;
import cz.mendelu.java.merchantgame.GameManager;
import cz.mendelu.java.merchantgame.actors.MarketActor;
import cz.mendelu.java.merchantgame.graphic.Images;
import cz.mendelu.java.merchantgame.input.OneButton;
import cz.mendelu.java.merchantgame.input.Button;
import cz.mendelu.java.merchantgame.input.ConfirmButton;
import cz.mendelu.java.merchantgame.input.DecadeButton;
import cz.mendelu.java.merchantgame.input.HundredButton;
import cz.mendelu.java.merchantgame.menu.PlayerStats;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author allc
 */
public class MarketState extends State {
    
    private String[] options = {"+", "-", "+10", "-10","+100", "-100"};
    private int currentSelection;  
    private Button ip1Button,im1Button,ip10Button,im10Button,ip100Button,im100Button,
            wp1Button,wm1Button,wp10Button,wm10Button,wp100Button,wm100Button,
            fp1Button,fm1Button,fp10Button,fm10Button,fp100Button,fm100Button,
            sellButton,buyButton, exitButton;
    private int iValue =0,wValue =0, fValue =0;
    
    
    
    private PlayerStats ps;
    private MarketActor market;
    public MarketState(GameManager gm) {
        super(gm);
        market = new MarketActor(gm);
        ps = new PlayerStats(gm);
        ip1Button = new OneButton(650,300 , 15, 15,"+");
        im1Button = new OneButton(650,320 , 15, 15,"-");
        ip10Button = new DecadeButton(675,300 , 15, 15,"+");
        im10Button = new DecadeButton(675,320 , 15, 15,"-");
        ip100Button = new HundredButton(700,300 , 15, 15,"+");
        im100Button = new HundredButton(700,320 , 15, 15,"-");
        wp1Button = new OneButton(650,350 , 15, 15,"+");
        wm1Button = new OneButton(650,370 , 15, 15,"-");
        wp10Button = new DecadeButton(675,350 , 15, 15,"+");
        wm10Button = new DecadeButton(675,370 , 15, 15,"-");
        wp100Button = new HundredButton(700,350 , 15, 15,"+");
        wm100Button = new HundredButton(700,370 , 15, 15,"-");
        fp1Button = new OneButton(650,400 , 15, 15,"+");
        fm1Button = new OneButton(650,420 , 15, 15,"-");
        fp10Button = new DecadeButton(675,400 , 15, 15,"+");
        fm10Button = new DecadeButton(675,420 , 15, 15,"-");
        fp100Button = new HundredButton(700,400 , 15, 15,"+");
        fm100Button = new HundredButton(700,420 , 15, 15,"-");
        sellButton = new ConfirmButton(650, 450, 120, 40, null);
        buyButton = new ConfirmButton(500, 450, 120, 40, null);
        exitButton = new ConfirmButton(150, 450, 120, 40, null);
        
       
        
    }

    @Override
    public void keyInput() {
        
        
    }

    /**
     *
     * @throws StorageSpaceException
     */
    @Override
    public void mouseInput() throws StorageSpaceException {
        
     ///////// PLUS, MINUS
        if(ip1Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                iValue += ip1Button.getValue();
        if(im1Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                iValue += im1Button.getValue();
        if(wp1Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                wValue += wp1Button.getValue();
        if(wm1Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                wValue += wp1Button.getValue();
        if(fp1Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                fValue += fp1Button.getValue();
        if(fm1Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                fValue += fm1Button.getValue();
        if(ip10Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                iValue += ip10Button.getValue();
        if(im10Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                iValue += im10Button.getValue();
        if(wp10Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                wValue += wp10Button.getValue();
        if(wm10Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                wValue += wp10Button.getValue();
        if(fp10Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                fValue += fp10Button.getValue();
        if(fm10Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                fValue += fm10Button.getValue();
        if(ip100Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                iValue += ip100Button.getValue();
        if(im100Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                iValue += im100Button.getValue();
        if(wp100Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                wValue += wp100Button.getValue();
        if(wm100Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                wValue += wp100Button.getValue();
        if(fp100Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                fValue += fp100Button.getValue();
        if(fm100Button.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                fValue += fm100Button.getValue();
    ///////////    CONFIRM
        if(sellButton.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY())){
            if(gm.getMouseManager().click){                
               try{ gm.gameState()
                        .getPlayer()
                        .getPlayer()
                        .sellMarketGoods(gm.gameState()
                                        .getWorld()
                                        .getMarket()
                                        .getMarket(), Goods.IRON, iValue);
                gm.gameState()
                        .getPlayer()
                        .getPlayer()
                        .sellMarketGoods(gm.gameState()
                                        .getWorld()
                                        .getMarket()
                                        .getMarket(), Goods.WOOD, wValue);
                gm.gameState()
                        .getPlayer()
                        .getPlayer()
                        .sellMarketGoods(gm.gameState()
                                        .getWorld()
                                        .getMarket()
                                        .getMarket(), Goods.FOOD, fValue);
               }catch(Exception e){
                   e.printStackTrace();
               }
               iValue = 0;
               wValue = 0;
               fValue = 0;
               }
        }
        if(buyButton.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY())){
             if(gm.getMouseManager().click){                
             try {   gm.gameState()
                        .getPlayer()
                        .getPlayer()
                        .buyMarketGoods(gm.gameState()
                                        .getWorld()
                                        .getMarket()
                                        .getMarket(), Goods.IRON, iValue);
                gm.gameState()
                        .getPlayer()
                        .getPlayer()
                        .buyMarketGoods(gm.gameState()
                                        .getWorld()
                                        .getMarket()
                                        .getMarket(), Goods.WOOD, wValue);
                gm.gameState()
                        .getPlayer()
                        .getPlayer()
                        .buyMarketGoods(gm.gameState()
                                        .getWorld()
                                        .getMarket()
                                        .getMarket(), Goods.FOOD, fValue);
            } catch ( Exception e){
                e.printStackTrace();
            }
             iValue = 0;
             wValue = 0;
             fValue = 0;
            }
        } 
        
    ///////////////EXIT
        
        if(exitButton.contains(gm.getMouseManager().getMouseX(), gm.getMouseManager().getMouseY()))
            if(gm.getMouseManager().click)
                StateManager.setState(gm.gameState());
        
        
        
    /////////
        if(gm.getMouseManager().click)
         gm.getMouseManager().click = false;
    }

    @Override
    public void update() {
        try {
            keyInput();
            
            mouseInput();
        } catch (StorageSpaceException ex) {
            Logger.getLogger(MarketState.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Images.buildingPanel, 0, 0,gm.getWidth(), gm.getHeight(), null);
        g.drawImage(Images.market, 60, 300, 110, 80, null);
        ps.render(g);
        //vykreslenie tlacidiel       
        /*for(int i=0; i<3;i++){
             int j;
             int s = 50*i;                
                for(j=0; j<3;j++){
                    int r = 25*j;
                    g.drawRect(650+r, 290+s, 15, 15);
                    
                }
                j = 0;ssss            
            }
        for(int i=0; i<3;i++){
             int j;
             int s = 50*i;                
                for(j=0; j<3;j++){
                    int r = 25*j;
                    g.drawRect(650+r, 310+s, 15, 15);
                    
                }
                j = 0;            
            }
        */
        //VYPIS +
            for(int i=0; i<3;i++){
                int j;
                int s = 50*i;                
                for(j=0; j<3;j++){
                    int r = 25*j;                   
                    g.setFont(new Font("Arial", Font.BOLD,25));
                    g.drawString(options[0],651+r , 309+s);
                  
                }
                j = 0;
                
            }
        //VYPIS -
            for(int i=0; i<3;i++){
                int j;
                int s = 50*i;             
                for(j=0; j<3;j++){
                    int r = 25*j;
                  g.drawString(options[1],651+r , 329+s);
                }
                j = 0;
                
            }
          // POTVRDENIE OBJEDNAVKY
            g.drawImage(Images.menubutton, 650, 450, 120, 40, null);
            g.drawString("Sell", 660, 480);
            g.drawImage(Images.menubutton, 500, 450, 120, 40, null);
            g.drawString("Buy", 510, 480);
            
            
            //RENDER OBJEDNAVKY
            g.drawImage(Images.menubutton, 490, 290, 100, 40, null);
            g.drawImage(Images.menubutton, 490, 340, 100, 40, null);
            g.drawImage(Images.menubutton, 490, 390, 100, 40, null);
            g.drawString(String.valueOf(iValue), 500, 320);
            g.drawString(String.valueOf(wValue), 500, 370);
            g.drawString(String.valueOf(fValue), 500, 420);
            
            //RENDER CENY
            g.drawImage(Images.menubutton, 400, 290, 60, 40, null);
            g.drawImage(Images.menubutton, 400, 340, 60, 40, null);
            g.drawImage(Images.menubutton, 400, 390, 60, 40, null);
            g.drawString(String.valueOf(gm.gameState()
                                           .getWorld()
                                           .getMarket() 
                                           .getMarket()
                                           .getPrice(Goods.IRON)), 410, 320);
            g.drawString(String.valueOf(gm.gameState()
                                           .getWorld()
                                           .getMarket() 
                                           .getMarket()
                                           .getPrice(Goods.WOOD)), 410, 370);
            g.drawString(String.valueOf(gm.gameState()
                                           .getWorld()
                                           .getMarket() 
                                           .getMarket()
                                           .getPrice(Goods.FOOD)), 410, 420);
            
            //RENDER AKTUALNEHO MNOZSTVA
            g.drawImage(Images.menubutton, 320, 290, 60, 40, null);
            g.drawImage(Images.menubutton, 320, 340, 60, 40, null);
            g.drawImage(Images.menubutton, 320, 390, 60, 40, null);
            g.drawString(String.valueOf(gm.gameState()
                                           .getWorld()
                                           .getMarket() 
                                           .getMarket()
                                           .getStorage()
                                           .getAmount(Goods.IRON)), 330, 320);
            g.drawString(String.valueOf(gm.gameState()
                                           .getWorld()
                                           .getMarket() 
                                           .getMarket()
                                           .getStorage()
                                           .getAmount(Goods.WOOD)), 330, 370);
            g.drawString(String.valueOf(gm.gameState()
                                           .getWorld()
                                           .getMarket()
                                           .getMarket()
                                           .getStorage()
                                           .getAmount(Goods.FOOD)), 330, 420);
            
            //RENDER NAZVU
            g.drawImage(Images.menubutton, 200, 290, 100, 40, null);
            g.drawImage(Images.menubutton, 200, 340, 100, 40, null);
            g.drawImage(Images.menubutton, 200, 390, 100, 40, null);
            g.drawString("IRON: ", 210, 320);
            g.drawString("WOOD: ", 210, 370);
            g.drawString("FOOD: ", 210, 420);
            
            //RENDER EXIT
            g.drawImage(Images.menubutton, 150, 450, 120, 40, null);
            g.drawString("GAME", 160, 480);
    }
    
}
