/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozyt.wizytator;

/**
 *
 * @author Pawel
 */
public interface Komponent {
    void dodaj(Komponent komponent);
    void wyswietl();
    int zliczaj(Wizytator wizytator);
    
}
