/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_most2;

/**
 *
 * @author Pawel
 */
public class Kolos2_most2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tuning spojler = new Spojler();
        Tuning zderzaki = new Zderzaki();
        Samochod bmw = new BMW(spojler, "bmw");
        bmw.tuninguj();
        
    }
    
}
