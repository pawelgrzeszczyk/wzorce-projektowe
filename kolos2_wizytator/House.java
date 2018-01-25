/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_wizytator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pawel
 */
public class House {
    private List<Visitable> residents = new ArrayList();
    
    public void addResident(Visitable resident){
        residents.add(resident);
    }
    
    public void visit(Visitor visitor){
        for(Visitable resident : residents){
            resident.accept(visitor);
        }
    }
    
}
