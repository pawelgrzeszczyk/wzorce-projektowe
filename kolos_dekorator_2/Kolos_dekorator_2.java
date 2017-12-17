/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_dekorator_2;

/**
 *
 * @author Pawel
 */
public class Kolos_dekorator_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ksztalt kolo = new Kolo();
        Ksztalt prostokat = new Prostokat();
        
        Ksztalt czerwony = new KolorCzerwony(kolo);
        Ksztalt niebieski = new KolorNiebieski(prostokat);
        
        czerwony.rysuj();
        niebieski.rysuj();
        
    }
    
}
