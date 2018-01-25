/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_stan;

/**
 *
 * @author Pawel
 */
public class Kolos2_stan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Context_TV context = new Context_TV();
        ON_tv on = new ON_tv();
        OFF_tv off = new OFF_tv();
        
        context.setStan(on);
        context.doAction();
        
        context.setStan(off);
        context.doAction();
    }
    
}
