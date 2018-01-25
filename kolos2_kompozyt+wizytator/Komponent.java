/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozytwizytator;

/**
 *
 * @author Matje
 */
public interface Komponent {
    void add(Komponent d);
    String formatuj(Wizytator w);
    void wyswietl();
}
