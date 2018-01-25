/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozytwizytator;

/**
 *
 * @author Matje
 */
public class KompozytWizytator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Wizytator w = new XMLWizytator();
        
        Komponent szkola = new Szkola("Szkola");
        Komponent szkola1 = new Szkola("Pod_szkola");
        
        Komponent klasa = new Klasa();
        Komponent klasa2 = new Klasa();
      
        szkola1.add(klasa);
        
        szkola.add(klasa);
        szkola.add(klasa2);
        szkola.add(szkola1);
        
        System.out.println(szkola.formatuj(w));
        
        
    }
    
}
