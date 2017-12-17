/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_strategia;

/**
 *
 * @author Pawel
 */
public class Kolos_strategia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Context con1 = new Context(new Dodawanie());
        System.out.println("10+5="+con1.executeStrategy(10, 5));
        Context con2 = new Context(new Odejmowanie());
        System.out.println("11-2="+con2.executeStrategy(11, 2));
        Context con3 = new Context(new Mnozenie());
        System.out.println("2*4="+con3.executeStrategy(2, 4));
    }
    
}
