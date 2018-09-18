/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.states;

/**
 *
 * @author allc
 */
public class StateManager {

    static State currentState = null;
    
    public static void setState(State state){
        StateManager.currentState=state;
    }
    
    public static State getState(){
        return currentState;
    }   
}
