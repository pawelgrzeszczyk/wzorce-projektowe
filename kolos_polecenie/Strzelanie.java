/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_polecenie;

/**
 *
 * @author Pawel
 */
public class Strzelanie implements Polecenie{
    private Zawodnik zawodnik;
    
    public Strzelanie(Zawodnik zawodnik){
        this.zawodnik = zawodnik;
    }
    
    @Override
    public void wykonaj() {
        zawodnik.zacznijStrzelac();
    }
}
