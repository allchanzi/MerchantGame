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
public class HundredButton extends Button {

    public HundredButton(int x, int y, int width, int height, String s) {
        super(x, y, width, height, s);
    }

    @Override
    public int getValue() {
        if(s == "-"){
            return -100;
        } else if(s == "+") {
            return 100;
        }
        return 0;
    }
    
}
