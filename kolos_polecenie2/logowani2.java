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
public class logowani2 implements Polecenie{

    private Serwer s;
    
    public logowani2(Serwer s){
        this.s = s;
    }
    
    @Override
    public void wykonaj() {
        s.zaloguj2();
    }
    
}
