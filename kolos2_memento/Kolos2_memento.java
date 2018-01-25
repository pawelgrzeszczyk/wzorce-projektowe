/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_memento;

/**
 *
 * @author Pawel
 */
public class Kolos2_memento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Orginator ori = new Orginator();
        CareTaker care = new CareTaker();
        
        
        ori.setStan("stan 1");
        ori.setStan("stan 2");
        ori.setStan("stan 3");
        care.add(ori.saveToMemento());
        System.out.println("obecny "+ori.getStan());
        System.out.println("przywracanie");
        ori.returnMemento(care.get(0));
        System.out.println(ori.getStan());
    }
    
}
