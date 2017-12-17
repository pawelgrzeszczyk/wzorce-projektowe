/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_fabryka;

/**
 *
 * @author Pawel
 */
public class Orzechowa extends Czekolada{
    
    public Orzechowa(){
        name = "Z orzechami ";
    }
    
    public void dodajOrzechy(){
        System.out.println("Dodaje orzechy ");
    }
    public void dodajMleko(){
        System.out.println("Dodaje mleko ");
    }
    
    @Override
    public Czekolada getCzekolada() {
        System.out.println(name);
        dodajKakao();
        dodajOrzechy();
        dodajMleko();
        return this;
    }
    
}
