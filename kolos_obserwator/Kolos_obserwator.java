/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_obserwator;

/**
 *
 * @author Pawel
 */
public class Kolos_obserwator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TotoLotek lotek = new TotoLotek();
        Telewizja telewizja = new Telewizja(lotek);
        Internet internet = new Internet(lotek);
        
        lotek.dodajObserwatora(telewizja);
        lotek.dodajObserwatora(internet);
        System.out.println("Losowanie 1");
        lotek.losuj();
        
        System.out.println("Losowanie 2");
        lotek.losuj();
        telewizja.rezygnuj();
        System.out.println("Losowanie 3");
        lotek.losuj();
        
        
        
    }
    
}
