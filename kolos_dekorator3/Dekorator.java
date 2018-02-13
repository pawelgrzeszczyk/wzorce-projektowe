/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_dekorator3;

/**
 *
 * @author Pawel
 */
public abstract class Dekorator implements Liczby{

    Liczby liczby;
    
    public Dekorator(Liczby liczby){
        this.liczby = liczby;
    }
    
    @Override
    public int[] liczby(){
       return liczby.liczby();
       
    }

    @Override
    public void wustwietl() {
        liczby.wustwietl();
    }
    
}
