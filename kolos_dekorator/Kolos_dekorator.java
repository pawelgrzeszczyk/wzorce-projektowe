/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_dekorator;

/**
 *
 * @author Pawel
 */
public class Kolos_dekorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Samochod s1 = new Bmw();
        Samochod s2 = new Polonez();
        
        System.out.println("Bez dodatkow");
        System.out.println(s1.about()+" cena:"+s1.cena());
        System.out.println(s2.about()+" cena:"+s2.cena());
        
        
        System.out.println("Z dodatkami");
        
        s1 = new Klimatyzacja(s1);
        System.out.println(s1.about()+" cena:"+s1.cena());
        
    }
    
}
