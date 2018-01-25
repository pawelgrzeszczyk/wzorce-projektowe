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
public abstract class Pracownik {
    private String imie,nazwisko,zawod;
    protected Pracownik kolejny;
    
    public Pracownik(String imie, String nazwisko, String zawod){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.zawod = zawod;
    }
    
    public void ustawKolejnego(Pracownik pracownik){
        kolejny = pracownik;
    }
    
    public abstract void wykonaj(Zadanie zadanie);
   
    
    
}
