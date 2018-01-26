/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozyt.wizytator;

import java.util.ArrayList;

/**
 *
 * @author Pawel
 */
public class KatalogKompozyt implements Komponent{
    ArrayList<Komponent> listaDzieci = new ArrayList();
    String nazwa;
    int waga = 1,suma = 0;

    public KatalogKompozyt(String nazwa) {
        this.nazwa = nazwa;
    }
    
    
    @Override
    public void dodaj(Komponent komponent) {
        listaDzieci.add(komponent);
    }

    @Override
    public void wyswietl() {
        for(Komponent k:listaDzieci)
            k.wyswietl();
    }

    @Override
    public int zliczaj(Wizytator wizytator) {
        suma = wizytator.visit(this);
        for(Komponent k:listaDzieci){
            suma += k.zliczaj(wizytator);  
        }
        return suma;
    }
    
    
}
