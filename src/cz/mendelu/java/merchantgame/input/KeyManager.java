/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author allc
 */
public class KeyManager implements KeyListener {
    
    private boolean[] keys;
    public boolean up,down,left,right,save,load,player,esc;

    public KeyManager() {
        keys = new boolean[256];
        
    }
    
    public void update(){
        up = keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_S];
        left = keys[KeyEvent.VK_A];
        right = keys[KeyEvent.VK_D];
        save = keys [KeyEvent.VK_J];
        load = keys [KeyEvent.VK_K];
        player = keys [KeyEvent.VK_P];
        esc = keys [KeyEvent.VK_ESCAPE];
    }
    

    @Override
    public void keyTyped(KeyEvent e) {    
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //getKeyCode() - vráti cislo prisluchajuce klavese to sa zmeni na false ked sa klavesa pusti
        keys[e.getKeyCode()] = true;
        System.out.println("Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
        System.out.println("Released");
    }
    
}
