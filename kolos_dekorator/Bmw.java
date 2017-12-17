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
public class Bmw extends Samochod{
    
    public Bmw(){
        samochod = "BMW";
    }
    
    @Override
    public int cena() {
        return 45000;
    }
    
}
