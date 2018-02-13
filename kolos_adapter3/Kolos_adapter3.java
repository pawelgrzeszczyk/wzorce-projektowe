/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_adapter3;

/**
 *
 * @author Pawel
 */
public class Kolos_adapter3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Wrobel wrobel = new Wrobel();
        
        System.out.println("wrobel");
        wrobel.dzwieki();
        wrobel.latanie();
        
        PlastikowaKaczka kaczka = new PlastikowaKaczka();
        
        System.out.println("kaczka");
        kaczka.odglos();
        
        Zabawka adapter = new AdapterPtak(wrobel);
        
        System.out.println("adapter zabawki wrobla");
        adapter.odglos();
        
        
    }
    
}
