/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozytwizytator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matje
 */
public class Szkola implements Komponent {

    List<Komponent> Lista_elementow = new ArrayList<Komponent>();
    String nazwa;

    public Szkola(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public void add(Komponent d) {
        Lista_elementow.add(d);
    }

    @Override
    public String formatuj(Wizytator w) {
        String wy=w.visit_start(this)+"\n";
        for (Komponent k : Lista_elementow) {
            wy+=k.formatuj(w)+"\n";

        }
        wy+=w.visit_stop(this);
        return wy;

    }

    @Override
    public void wyswietl() {
        for (Komponent k : Lista_elementow) {
            k.wyswietl();
        }
    }

    String get_nazwa() {
        return this.nazwa;
    }

}
