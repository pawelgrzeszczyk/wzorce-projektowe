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
public class Polonez extends Samochod{
   
    
    public Polonez(){
        samochod = "Polonez";
    }
    
    @Override
    public int cena() {
        return 10000;
    }
    
}
