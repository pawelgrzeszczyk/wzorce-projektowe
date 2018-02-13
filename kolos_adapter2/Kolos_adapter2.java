/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_adapter2;

/**
 *
 * @author Pawel
 */
public class Kolos_adapter2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Writer nowy = new WriterAdapter();
        nowy.save("napis");
    }
    
}
