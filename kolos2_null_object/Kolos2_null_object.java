/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_null_object;

/**
 *
 * @author Pawel
 */
public class Kolos2_null_object {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PasazerAbstract p1 = new PasazerFabryka().getPasazer("andrzej");
        PasazerAbstract p2 = new PasazerFabryka().getPasazer("kuba");
        PasazerAbstract p3 = new PasazerFabryka().getPasazer("marek");
        PasazerAbstract p4 = new PasazerFabryka().getPasazer("arek");
        
        
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());
        System.out.println(p4.getName());
    }
    
}
