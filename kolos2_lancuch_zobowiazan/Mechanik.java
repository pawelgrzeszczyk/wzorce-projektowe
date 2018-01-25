/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_lancuch.zobowiazan;

/**
 *
 * @author Pawel
 */
public class Mechanik extends Pracownik{

    public Mechanik(String imie, String nazwisko, String zawod){
        super(imie,nazwisko,zawod);
    }
    
    @Override
    public void wykonaj(Zadanie zadanie) {
        if(zadanie.getZawod().equals("mechanik"))
            System.out.println("naprawiam samochod");
        else if(kolejny != null){
            System.out.println("przechodze dalej");
            kolejny.wykonaj(zadanie);
        }
    }
    
    
}
