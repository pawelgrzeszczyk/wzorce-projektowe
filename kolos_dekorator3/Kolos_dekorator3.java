/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_dekorator3;

/**
 *
 * @author Pawel
 */
public class Kolos_dekorator3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Liczby pierwsze = new Od1Do10();
        Liczby parzyste = new Parzyste(pierwsze);
        pierwsze.wustwietl();
        parzyste.liczby();
        
        
    }
    
}
