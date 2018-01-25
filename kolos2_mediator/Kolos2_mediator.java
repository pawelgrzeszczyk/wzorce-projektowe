/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_mediator;

/**
 *
 * @author Pawel
 */
public class Kolos2_mediator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User adam = new User("adam");
        User marek = new User("marek");
        adam.sendMessage("czesc jestem adam");
        marek.sendMessage("czesc jestem marek");
    }
    
}
