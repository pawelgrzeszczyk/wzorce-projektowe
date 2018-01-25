/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozyt.memento;

/**
 *
 * @author Matje
 */
public class KompozytMemento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        
        
        Kompozyt_drzewo A = new Lisc("13,6", "A");
        Kompozyt_drzewo B = new Lisc("12,3", "B");
        Kompozyt_drzewo C = new Lisc("22,7", "C");
        Kompozyt_drzewo D = new Lisc("35,7", "D");
        Kompozyt_drzewo Node1 = new Tree(originator,careTaker);
        Kompozyt_drzewo Node2 = new Tree(originator,careTaker);
        Kompozyt_drzewo Node3 = new Tree(originator,careTaker);
        Node1.add(D);
        Node1.add(Node2);
        Node1.add(Node3);
        Node3.add(A);
        Node3.add(B);
        Node2.add(C);
        Node3.zmien("A", "99");
        Node3.wyswietl_poprzedni_stan();
        Node1.print();
        
        
    }
    
}
