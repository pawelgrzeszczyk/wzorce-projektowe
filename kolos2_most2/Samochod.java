/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_most2;

/**
 *
 * @author Pawel
 */
public abstract class Samochod {
    protected Tuning tuning;
    
    public Samochod(Tuning tuning){
        this.tuning = tuning;
    }
    public abstract void tuninguj();
    
}
