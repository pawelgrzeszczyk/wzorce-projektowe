/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_iterator;

/**
 *
 * @author Pawel
 */
public class NewKontener implements Kontener{
    public String[] tab = {"Andrzej","Waldek","Marek","Janusz"};
    
    @Override
    public Iterator getIterator() {
        return new NewIterator();
    }
    
    private class NewIterator implements Iterator{
        
        int id;
        
        @Override
        public boolean hasNext() {
            if(id < tab.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return tab[id++];
            }
        return null;
        }
        
    }
    
}
