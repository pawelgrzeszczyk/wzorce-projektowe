/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_mediator2;

/**
 *
 * @author Pawel
 */
public class User {
    private Mediator mediator;
    private String name;
    private String message;
    
    public User(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }
    
    public void sendMessage(){
        this.mediator.sendMessage(message);
    }
    
    public void receiveMessage(String message){
        System.out.println("message: "+message+" ,from: "+name);
    }
    
    
}
