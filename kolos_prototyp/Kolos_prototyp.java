/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_prototyp;

/**
 *
 * @author Pawel
 */
public class Kolos_prototyp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      FabrykaKopii fabryka = new FabrykaKopii();
      Samochod samochod = new Samochod();
      Samochod klon = (Samochod) fabryka.getKlony(samochod);
      
    }
    
}
