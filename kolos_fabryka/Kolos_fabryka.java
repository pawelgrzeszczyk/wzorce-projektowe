/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_fabryka;

/**
 *
 * @author Pawel
 */
public class Kolos_fabryka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProdukcjaCzekolady producent = new ProdukcjaCzekolady();
        Czekolada[] czeko = new Czekolada[2];
        czeko[0] = producent.produkuj("Mleczna");
        czeko[1] = producent.produkuj("Z orzechami");
        
    }
    
}
