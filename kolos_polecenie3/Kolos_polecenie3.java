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
public class Kolos_polecenie3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Broker broker = new Broker();
        Stock s = new Stock("aa", 5);
        
        Buy buy = new Buy(s);
        SellStock sell = new SellStock(s);
        
        broker.dodajPolecenie(buy);
        broker.dodajPolecenie(sell);
        
        broker.wykonaj();
        
    }
    
}
