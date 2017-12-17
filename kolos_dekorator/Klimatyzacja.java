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
public class Klimatyzacja extends Dekorator{
    
    
    public Klimatyzacja(Samochod samochod){
        super(samochod);
    }
    
    @Override
    public String about() {
        return samochod.about()+" z klimatyzacja";
    }

    @Override
    public int cena() {
        return samochod.cena()+1000;
    }
    
}
