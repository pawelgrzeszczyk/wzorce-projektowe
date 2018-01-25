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
public class Klasa implements Komponent{
    String nazwa = "Klasa";
    
    
    
    @Override
    public void add(Komponent d) {
        System.out.println("to jest klasa. Nie można nic dodać.");
    }

    @Override
    public String formatuj(Wizytator w) {
        return w.visit(this);
    }

    @Override
    public void wyswietl() {
        System.out.print(this.nazwa);
    }
    String getNazwa(){
        return this.nazwa;
        
    }
    
}
