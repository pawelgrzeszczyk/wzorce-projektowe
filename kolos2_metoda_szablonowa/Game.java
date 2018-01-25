/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_metoda.szablonowa;

/**
 *
 * @author Pawel
 */
public abstract class Game {
    
    abstract void startGame();
    abstract void endGame();
    
    
    public void play(){
        startGame();
        endGame();
    }
    
    
}
