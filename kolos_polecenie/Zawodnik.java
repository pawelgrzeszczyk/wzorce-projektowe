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
public class Zawodnik {
    private String nazwa;
    
    public Zawodnik(String nazwa){
        this.nazwa = nazwa;
    }
    
    public void zacznijBiegac(){
        System.out.println("Zawodnik "+nazwa+" zaczal biegac");
    }
    public void zacznijPlywac(){
        System.out.println("Zawodnik "+nazwa+" zaczal plywac");
    }
    public void zacznijStrzelac(){
        System.out.println("Zawodnik "+nazwa+" zaczal strzelac");
    }
}
