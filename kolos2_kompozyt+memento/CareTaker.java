/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozyt.memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matje
 */
public class CareTaker {
    
    List<Memento> listMemento = new ArrayList<Memento>();
    
    void addState(Memento memento){
        listMemento.add(memento);   
    }
    
    Memento getState(int index){
        return listMemento.get(index);
        
    }
    
    
}
