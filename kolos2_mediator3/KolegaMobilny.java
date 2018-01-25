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
public class KolegaMobilny extends User{

    public KolegaMobilny(CentralaMediator centrala) {
        super(centrala);
    }

    @Override
    public void recive(String message) {
        System.out.println("kolega mobilny pisze: "+message);
    }
    
}
