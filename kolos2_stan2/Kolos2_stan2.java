/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_stan2;

/**
 *
 * @author Pawel
 */
public class Kolos2_stan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Context context = new Context();
        jalowy jalowy = new jalowy();
        bieg1 jeden = new bieg1();
        bieg2 dwa = new bieg2();
        bieg3 trzy = new bieg3();
        
        context.setStan(jalowy);
        context.doAction();
        
        context.setStan(jeden);
        context.doAction();
        
        context.setStan(dwa);
        context.doAction();
    }
    
}
