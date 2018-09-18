/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame.worlds;

/**
 *
 * @author allc
 */
public class OrbisManager {

    public static Orbis currentOrbis = null;
    
    public static void setOrbis(Orbis orbis){
        currentOrbis = orbis;
    }
    
    public static Orbis getOrbis(){
        return currentOrbis;
    }
    
}
