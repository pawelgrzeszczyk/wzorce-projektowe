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
public class Kolos_polecenie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Broker trener = new Broker();
       
       Zawodnik z1 = new Zawodnik("Malysz");
       Zawodnik z2 = new Zawodnik("Ryb");
       Zawodnik z3 = new Zawodnik("Zenek");
       
       Plywanie p = new Plywanie(z1);
       Bieganie b = new Bieganie(z2);
       Strzelanie s = new Strzelanie(z3);
       
       trener.dodajPolecenie(p);
       trener.dodajPolecenie(b);
       trener.dodajPolecenie(s);
       
       trener.wykonaj();
       
       Polecenie [] tab = { new Plywanie(z1), new Bieganie(z1), new Strzelanie(z1) };
       PelnyTrening trening = new PelnyTrening(tab);
       trener.dodajPolecenie(trening);
       trener.wykonaj();
       
    }
    
}
