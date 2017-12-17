/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_dekorator_2;

/**
 *
 * @author Pawel
 */
public abstract class Dekorator extends Ksztalt{
    protected Ksztalt k;
    
    public Dekorator(Ksztalt k){
        this.k = k;
    }
    public void rysuj(){
        k.rysuj();
    }
    
}
