/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_kompozyt;

/**
 *
 * @author Pawel
 */
public class Leaf implements Component{
    String nazwa;
    
    public Leaf(String nazwa){
        this.nazwa = nazwa;
    }
    
    
    @Override
    public void dodaj(Component component) {
        System.out.println("nie mozna dodawac do pliku");
    }

    @Override
    public void usun(Component component) {
        System.out.println("nie mozna usuwac z pliku");
    }

    @Override
    public void zmien(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public void wyswietl() {
        System.out.println(nazwa);
    }

   

   
    
}
