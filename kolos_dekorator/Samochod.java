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
public abstract class Samochod {
    protected String samochod = "Samochod podstawowy";
    
    public String about(){
        return samochod;
    }
    public abstract int cena();
    
}
