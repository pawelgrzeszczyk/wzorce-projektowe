/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_mediator3;

/**
 *
 * @author Pawel
 */
public abstract class User {
    private CentralaMediator centrala;
    
    
    public User(CentralaMediator centrala){
        this.centrala = centrala;
        
    }
    
    public void send(String message){
        centrala.sendMessage(message, this);
    }
    public CentralaMediator getMediator(){
        return centrala;
    }
    public abstract void recive(String message);
    
}
