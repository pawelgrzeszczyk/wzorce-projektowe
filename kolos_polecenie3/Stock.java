/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_polecenie3;

/**
 *
 * @author Pawel
 */
public class Stock {
    private String nazwa;
    private int cena;
    
    public Stock(String nazwa, int cena){
        this.nazwa = nazwa;
        this.cena = cena;
    }
    
    public void buy(){
        System.out.println("buy "+nazwa+" "+cena);
    }
    public void sell(){
        System.out.println("sell "+nazwa+" "+cena);
    }
}
