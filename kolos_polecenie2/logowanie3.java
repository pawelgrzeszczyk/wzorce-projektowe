/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_polecenie2;

/**
 *
 * @author Pawel
 */
public class logowanie3 implements Polecenie{

    private Serwer s;
    
    public logowanie3(Serwer s){
        this.s = s;
    }
    
    @Override
    public void wykonaj() {
        s.zaloguj3();
    }
    
}
