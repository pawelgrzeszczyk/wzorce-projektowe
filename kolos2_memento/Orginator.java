/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_memento;

/**
 *
 * @author Pawel
 */
public class Orginator {
    private String stan;
    
    public String getStan(){
        return stan;
    }
    public void setStan(String stan){
        this.stan = stan;
    }
    
    public Memento saveToMemento(){
        return new Memento(stan);
    }
    public void returnMemento(Memento memento){
        stan = memento.getStan();
        
    }
    
}
