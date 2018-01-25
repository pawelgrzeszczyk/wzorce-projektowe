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
public class Originator {
   
    String state;
    
    
    Memento saveToMemento(String state){
        return new Memento(state);
    }
    
    
    public String getState(){
        return state;
        
    }

    void setState(String state){
        this.state=state;
        
    }
    
    
    
    
    
}
