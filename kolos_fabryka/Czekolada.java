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
public abstract class Czekolada {
    public String name;
    public abstract Czekolada getCzekolada();
    public void dodajKakao(){
        System.out.println("Dodaje kakao ");
    }
    
}
