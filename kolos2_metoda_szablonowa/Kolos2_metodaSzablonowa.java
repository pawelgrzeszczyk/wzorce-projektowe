/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_metoda.szablonowa;

/**
 *
 * @author Pawel
 */
public class Kolos2_metodaSzablonowa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game game = new CS();
        game.play();
        game = new Plemiona();
        game.play();
    }
    
}
