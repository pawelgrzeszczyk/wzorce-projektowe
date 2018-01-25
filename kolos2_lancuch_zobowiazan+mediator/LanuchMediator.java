/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanuchmediator;

/**
 *
 * @author Matje
 */
public class LanuchMediator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mediator m = new Mediator_firma();
        Firma_inf firma = new Wycena(m);
        firma.do_zadanie(2);
        
    }
    
}
