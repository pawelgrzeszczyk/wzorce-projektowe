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
public class Kolos_iterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewKontener kontener = new NewKontener();
        
        for(Iterator i = kontener.getIterator(); i.hasNext(); ){
            String name = (String)i.next();
            System.out.println("name: "+name);
        }
        
        
    }
    
}
