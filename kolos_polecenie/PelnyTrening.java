/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_polecenie;

/**
 *
 * @author Pawel
 */
public class PelnyTrening implements Polecenie{
    private Polecenie [] tab;
    
    public PelnyTrening(Polecenie [] tab){
        this.tab = tab;
    }
            
    @Override
    public void wykonaj() {
        for(Polecenie p : tab){
            p.wykonaj();
        }
    }
    
}
