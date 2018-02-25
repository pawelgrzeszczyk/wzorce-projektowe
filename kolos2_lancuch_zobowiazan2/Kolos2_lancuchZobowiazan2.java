/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_lancuch.zobowiazan2;

/**
 *
 * @author Pawel
 */
public class Kolos2_lancuchZobowiazan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LancuchZobowiazan l1 = new Banknot10();
        LancuchZobowiazan l2 = new Banknot20();
        LancuchZobowiazan l3 = new Banknot50();
        
        l1.setNext(l2);
        l2.setNext(l3);
        
        Waluta w = new Waluta(20);
        l1.rozdziel(w);
        
    }
    
}
