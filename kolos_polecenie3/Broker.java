/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_polecenie3;

import java.util.ArrayList;

/**
 *
 * @author Pawel
 */
public class Broker {
    private ArrayList<Polecenie> listaPolecen = new ArrayList();
    
    public void dodajPolecenie(Polecenie p){
        listaPolecen.add(p);
    }
    
    public void wykonaj(){
        for(Polecenie p: listaPolecen)
            p.wykonaj();
    }
    
}
