/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_mediator2;

/**
 *
 * @author Pawel
 */
public class Kolos2_mediator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MediatorCentrala centrala = new MediatorCentrala();
        User u1 = new User("pszemek", centrala);
        User u2 = new User("pafel", centrala);
        
        centrala.dodajUzytkownika(u1);
        centrala.dodajUzytkownika(u2);
        u1.sendMessage();
        
    }
    
}
