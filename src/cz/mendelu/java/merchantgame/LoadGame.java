/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame;

import cz.mendelu.java.hra.merchant.Merchant;
import cz.mendelu.java.hra.trade.Market;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author allc
 */
public class LoadGame {

    public static Market loadMarket() {
        Market e;
        try
      {
         FileInputStream fileIn = new FileInputStream("market.sav");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Market) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return null;
      }catch(ClassNotFoundException c)
      {
         System.out.println("Market class not found");
         c.printStackTrace();
         return null;
      }
        return e;
    }
            
    public static Merchant loadPlayer() {
         Merchant e;
        try
      {
         FileInputStream fileIn = new FileInputStream("player.sav");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Merchant) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return null;
      }catch(ClassNotFoundException c)
      {
         System.out.println("Market class not found");
         c.printStackTrace();
         return null;
      }
      return e;  
    }
}
