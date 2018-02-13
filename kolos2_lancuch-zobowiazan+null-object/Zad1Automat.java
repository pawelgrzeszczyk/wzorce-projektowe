/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

/**
 *
 * @author Marcin
 */
public class Zad1Automat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Banknot banknot = new Banknot(150, "PLN");
        
        ModulBilety bilety = new ModulBilety();
        ModulKupony kupony = new ModulKupony();
        ModulZaslepka zaslepka = new ModulZaslepka();
        
        bilety.setNext(kupony);
        kupony.setNext(zaslepka);
        
        DokumentOplaty dokument = bilety.execute(banknot);
        dokument.wyswietl();
    }
    
}
