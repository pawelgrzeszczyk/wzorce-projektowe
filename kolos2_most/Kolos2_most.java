/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_most;

/**
 *
 * @author Pawel
 */
public class Kolos2_most {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape zielone = new Circle(10, 5, 5, new greenCircle());
        Shape czerwone = new Circle(10,100,100, new redCircle());
        
        zielone.drawShape();
        czerwone.drawShape();
    }
    
}
