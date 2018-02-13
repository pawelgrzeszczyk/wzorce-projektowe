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
public class Kolos_polecenie2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Broker broker = new Broker();
        Serwer s = new Serwer();
        logowanie1 user1 = new logowanie1(s);
        logowani2 user2 = new logowani2(s);
        logowanie3 user3 = new logowanie3(s);
        
        broker.dodajPolecenie(user1);
        broker.dodajPolecenie(user2);
        broker.dodajPolecenie(user3);
        
        broker.wykonaj();
        
        
    }
    
}
