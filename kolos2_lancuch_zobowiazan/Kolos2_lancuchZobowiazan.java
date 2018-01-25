/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_lancuch.zobowiazan;

/**
 *
 * @author Pawel
 */
public class Kolos2_lancuchZobowiazan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pracownik informatyk = new Informatyk("Jan", "Niexbedny", "informatyk");
        Pracownik mechanik = new Mechanik("Czesio", "Zlotaraczka", "mechanik");
        
        mechanik.ustawKolejnego(informatyk);
        Zadanie naprawa_kompa = new ZadanieInformatyk("informatyk");
        mechanik.wykonaj(naprawa_kompa);
    }
    
}
