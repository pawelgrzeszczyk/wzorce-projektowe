/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozyt.wizytator;

/**
 *
 * @author Pawel
 */
public class PlikLisc implements Komponent{
    int waga = 1;
    String nazwa;

    public PlikLisc(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public void dodaj(Komponent komponent) {
        System.out.println("nie mozna dodac");
    }

    @Override
    public void wyswietl() {
        System.out.println(nazwa);
    }

    @Override
    public int zliczaj(Wizytator wizytator) {
        return wizytator.visit(this);
    }
    
}
