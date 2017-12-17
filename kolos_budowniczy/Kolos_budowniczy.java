/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_budowniczy;

/**
 *
 * @author Pawel
 */
public class Kolos_budowniczy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dyrektor kierownik = new Dyrektor();
        
        Budowniczy b1 = new XX();
        Budowniczy b2 = new YY();
        
        kierownik.wybierzBudowniczy(b1);
        kierownik.skladaj();
        ZestawKomputerowy z1 = kierownik.getZestaw();
        kierownik.wybierzBudowniczy(b2);
        kierownik.skladaj();
        ZestawKomputerowy z2 = kierownik.getZestaw();
        System.out.println("Zestaw 1");
        z1.show();
        System.out.println("Zestaw 2");
        z2.show();
    }
    
}
