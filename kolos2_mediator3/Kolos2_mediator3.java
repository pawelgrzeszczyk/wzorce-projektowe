/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_mediator3;

/**
 *
 * @author Pawel
 */
public class Kolos2_mediator3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CentralaGlowna mediator = new CentralaGlowna();
        User u1 = new KolegaMobilny(mediator);
        User u2 = new KolegaStacjonarny(mediator);
        mediator.dodajUsera(u1);
        mediator.dodajUsera(u2);
        u1.send("hello stacjonarny");
        u2.send("hello mobilny");
        
    }
    
}
