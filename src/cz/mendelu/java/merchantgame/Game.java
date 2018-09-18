/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.java.merchantgame;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import cz.mendelu.java.merchantgame.display.Display;
import cz.mendelu.java.merchantgame.graphic.GameCamera;
import cz.mendelu.java.merchantgame.graphic.Images;
import cz.mendelu.java.merchantgame.input.KeyManager;
import cz.mendelu.java.merchantgame.input.MouseManager;
import cz.mendelu.java.merchantgame.states.GameState;
import cz.mendelu.java.merchantgame.states.MarketState;
import cz.mendelu.java.merchantgame.states.MenuState;
import cz.mendelu.java.merchantgame.states.State;
import cz.mendelu.java.merchantgame.states.StateManager;
import java.io.Serializable;

/**
 *
 * @author allc
 */
public class Game implements Runnable {
    //Okno
    private Display display;
    public String title;
    private int width, height;
    
    //Grafika
    private BufferStrategy bufferStrategy;
    private Graphics graphic;
    private BufferedImage image;
    private Images img = new Images();    
    
    //Stavy hry
    private State gameState;
    private State menuState;
    private State marketState;
    
    //Vstup
    private KeyManager keyManager;
    private MouseManager mouseManager;
    
    private GameCamera gameCamera;
    private GameManager gameManager;
    
    private Thread thread;
    private boolean running = false;
    
    public Game(int width, int height, String title){
        this.width = width;
        this.height =height;
        this.title=title;
        keyManager=new KeyManager();
        mouseManager = new MouseManager();
        
    }
    //Inicializácia hry
    private void init() {
        display = new Display(width, height, title);
        display.getFrame().addKeyListener(keyManager);
        display.getFrame().addMouseListener(mouseManager);
        display.getFrame().addMouseMotionListener(mouseManager);
        display.getCanvas().addMouseListener(mouseManager);
        display.getCanvas().addMouseMotionListener(mouseManager);
        
        
        gameCamera = new GameCamera(this,0, 0);
        gameManager = new GameManager(this);
        
        marketState = new MarketState(gameManager);
        menuState = new MenuState(gameManager);
        gameState= new GameState(gameManager);
        StateManager.setState(menuState);
    }
    
    
    
    private void update(){
        keyManager.update();
        if(StateManager.getState()!=null){
            StateManager.getState().update();
        }
       
        
        
    }
    
    public void render(){
        bufferStrategy = display.getCanvas().getBufferStrategy();
        if(bufferStrategy == null){
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        graphic = bufferStrategy.getDrawGraphics();
        graphic.clearRect(0, 0, width, height);
        
        if(StateManager.getState()!=null){
            StateManager.getState().render(graphic);
        }
        graphic.dispose();
        bufferStrategy.show();
    }
    
    
    @Override
    public void run(){
        //gameloop kód ... java-gaming.org
       /*
        
        long lastLoopTime = System.nanoTime(); // momentálny čas v nano sekundách
        int fps = 60;
        double optimalTimePerUpdate = 1000000000 / fps; //sekunda(n.s) / fps
        double delta = 0;*/
        
        
        long timer = 0;
        int update = 0;
        
        
        init();
        
        
        long oldTime = System.nanoTime();
        
        //Game loop
        while(running){     
            long startTime = System.nanoTime(); // cas pred rendrom
    
            update();
            render();
            
            long endTime= System.nanoTime(); // cas po renderovani
            long timeLeft =16666666 - (startTime- endTime); // cas volny pre uspanie
            
            if(timeLeft > 0){
               
                try {
                    Thread.sleep(timeLeft /1000000, (int) timeLeft%1000000);
                      } catch (InterruptedException ex) {
                    Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
                
                /* long now = System.nanoTime();
                delta += (now - lastLoopTime) / optimalTimePerUpdate; //kolko casu ostáva do dalsieho volania update() a render()
                timer += now - lastLoopTime;
                lastLoopTime = now;
                
                if(delta >= 1){
                update();
                render();
                update++;
                delta--;
                }
                
                
                
                if(timer >= 1000000000){
                System.out.println("FPS: " + update);
                update = 0;
                timer = 0;
                }*/
          
           
            
        }
        stop();
    }
    
    public synchronized void start(){
        if (running)
            return;
        running = true;
        thread = new Thread(this);
        thread.start();
    }
    
    public void stop(){
        graphic.dispose();
        if (running == false){
            return;
        }
        running = false;
        try {
            thread.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }        
    }

    public KeyManager getKeyManager() {
        return keyManager;
    }

    public GameCamera getGameCamera() {
        return gameCamera;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public State getGameState() {
        return gameState;
    }

    public State getMenuState() {
        return menuState;
    }

    public State getMarketState() {
        return marketState;
    }

    
    

    public MouseManager getMouseManager() {
        return mouseManager;
    }

    
    
    

    
    
    
    
    
    
    
}
