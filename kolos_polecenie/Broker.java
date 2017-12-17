/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_polecenie;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pawel
 */
public class Broker {
    private List<Polecenie> listaPolecen = new ArrayList();
    
    public void dodajPolecenie(Polecenie p){
        listaPolecen.add(p);
    }
    
    public void wykonaj(){
        for (Polecenie p : listaPolecen){
            p.wykonaj();
        }
        listaPolecen.clear();
    }
    
    
    
}
