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
public class KolegaStacjonarny extends User{

    public KolegaStacjonarny(CentralaMediator centrala) {
        super(centrala);
    }

    @Override
    public void recive(String message) {
        System.out.println("Kolega stacjonarny pisze: "+message);
    }
    
}
