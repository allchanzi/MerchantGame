/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame;

import cz.mendelu.java.hra.merchant.Merchant;
import cz.mendelu.java.hra.trade.Market;
import cz.mendelu.java.merchantgame.actors.MarketActor;
import cz.mendelu.java.merchantgame.actors.PlayerActor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author allc
 */
public class SaveGame {
    
    
    
    public static void save(Merchant player, Market market){
        try {
            FileOutputStream outPlayer = new FileOutputStream(new File("player.sav"));
            ObjectOutputStream outP = new ObjectOutputStream(outPlayer);
            outP.writeObject(player);
            outP.close();
            
        } catch(IOException e) {
           e. printStackTrace();
        }
        try {
            FileOutputStream outMarket = new FileOutputStream(new File("market.sav"));
            ObjectOutputStream outM = new ObjectOutputStream(outMarket);
            outM.writeObject(market);
            outM.close();
            
        } catch(IOException e) {
           e. printStackTrace();
        }
    }
    
            
}
