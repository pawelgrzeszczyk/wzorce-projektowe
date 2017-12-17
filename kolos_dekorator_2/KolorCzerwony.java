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
public class KolorCzerwony extends Dekorator{
    public KolorCzerwony(Ksztalt k){
        super(k);
    }
    public void rysuj(){
        k.rysuj();
        dodajKolor(k);
    }
    public void dodajKolor(Ksztalt k){
        System.out.println("kolor czerwony");
    }
    
}
