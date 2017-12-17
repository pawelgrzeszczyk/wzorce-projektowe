/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_fabryka;

/**
 *
 * @author Pawel
 */
public class ProdukcjaCzekolady extends Fabryla{
    public Czekolada produkuj(String name){
        Czekolada czekolada = null;
        
        if(name.equalsIgnoreCase("Mleczna"))
            czekolada = new Mleczna();
        else if(name.equalsIgnoreCase("Z orzechami"))
            czekolada = new Orzechowa();
        
        return czekolada.getCzekolada();
        
    }
}
