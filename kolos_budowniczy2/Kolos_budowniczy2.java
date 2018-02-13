/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_budowniczy2;

/**
 *
 * @author Pawel
 */
public class Kolos_budowniczy2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dyrektor dyrektor = new Dyrektor();
        Budowniczy hawajska = new Hawajska();
        Budowniczy margarita = new Margarita();
        
        dyrektor.setBudowniczy(hawajska);
        dyrektor.skladaj();
        Pizza pizza = dyrektor.getPizza();
        
    }
    
}
