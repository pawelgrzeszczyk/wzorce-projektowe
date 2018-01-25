/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozyt.memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Matje
 */
public class Tree implements Kompozyt_drzewo {

    String node;
    CareTaker careTaker;
    Originator originator;
            

    public Tree(Originator originator, CareTaker careTaker) {
        this.node = "Node";
        this.originator=originator;
        this.careTaker=careTaker;
    }

    List<Kompozyt_drzewo> NodeList = new ArrayList<>();

    @Override
    public void add(Kompozyt_drzewo k) {
        NodeList.add(k);
    }

    @Override
    public void zmien(String klucz, String wartosc) {
        for (Kompozyt_drzewo k : NodeList) {
            if (k.getWartosc() == "Node") {
                continue;
            }
            if (k.getKlucz() == klucz) {
                int index = NodeList.indexOf(k);
                originator.setState(k.getWartosc());
                careTaker.addState(originator.saveToMemento(k.getWartosc()));
                k.setWartosc(wartosc);
                NodeList.set(index, k);
            }

        }
    }

    @Override
    public void cofnij(String klucz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Kompozyt_drzewo getChild(int i) {
        return NodeList.get(i);
    }

    @Override
    public String getWartosc() {
        return this.node;
    }

    @Override
    public void setWartosc(String wartosc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getKlucz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void print() {
        System.out.println("-------------");
        System.out.println("Name =" + this.getWartosc());
        System.out.println("-------------");

        Iterator<Kompozyt_drzewo> Iterator = NodeList.iterator();
        while (Iterator.hasNext()) {
            Kompozyt_drzewo k = Iterator.next();
            k.print();
        }
    }
    
    
    @Override
    public void wyswietl_poprzedni_stan(){
        System.out.println(careTaker.getState(careTaker.listMemento.size()-1).getState());
    }
    
    

}
