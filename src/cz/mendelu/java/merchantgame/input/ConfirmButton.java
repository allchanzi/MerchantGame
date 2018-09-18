/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.input;

/**
 *
 * @author allc
 */
public class ConfirmButton extends Button {

    public ConfirmButton(int x, int y, int width, int height, String s) {
        super(x, y, width, height, s);
    }

    @Override
    public int getValue() {
        return 0;
    }
    
}
