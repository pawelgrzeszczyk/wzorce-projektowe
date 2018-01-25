/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_wizytator;

/**
 *
 * @author Pawel
 */
public class Kolos2_wizytator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Visitable mother = new Mother();
        Visitable father = new Father();
        
        Visitor grand = new Grandmother();
        House house = new House();
        house.addResident(father);
        house.addResident(mother);
        house.visit(grand);
    }
    
}
