/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame;

/**
 *
 * @author allc
 */
public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Game game = new Game(800, 600, "Merchant");
        game.start();
        
    }
    
}
