/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozyt.memento;

/**
 *
 * @author Matje
 */
public class Memento {

    String state;

    public Memento(String state) {
        this.state = state;
    }
    
    String getState(){
        return state;
        
        
    }

}
