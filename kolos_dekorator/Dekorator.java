/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_dekorator;

/**
 *
 * @author Pawel
 */
public abstract class Dekorator extends Samochod{
    protected Samochod samochod;
    
    public Dekorator(Samochod samochod){
        this.samochod = samochod;
    }
    
    public abstract String about();
}
