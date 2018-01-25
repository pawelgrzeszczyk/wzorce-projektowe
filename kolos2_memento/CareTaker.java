/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_memento;

import java.util.ArrayList;

/**
 *
 * @author Pawel
 */
public class CareTaker {
    private ArrayList<Memento> mementoList = new ArrayList();
    
    public void add(Memento stan){
        mementoList.add(stan);
    }
    public Memento get(int id){
        return mementoList.get(id);
    }
}
