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
public class Buy implements Polecenie{

    private Stock s;
    
    public Buy(Stock s){
        this.s = s;
    }
    
    
    @Override
    public void wykonaj() {
        s.buy();
    }
    
}
