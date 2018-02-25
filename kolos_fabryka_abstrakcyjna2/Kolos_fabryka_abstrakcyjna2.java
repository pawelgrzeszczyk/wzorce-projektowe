/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_fabryka_abstrakcyjna2;

/**
 *
 * @author Pawel
 */
public class Kolos_fabryka_abstrakcyjna2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KomputerFactory fabryka = new KomputerFactory();
        Komputer pc = fabryka.getKomputer(new PC_Factory("i5", "1TB", "8GB"));
        Komputer server = fabryka.getKomputer(new Server_Factory("i3", "100GB", "12GB"));
        
        System.out.println("pc: "+pc);
        System.out.println("server: "+server);
        
    }
    
}
