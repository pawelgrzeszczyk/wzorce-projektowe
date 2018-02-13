/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_budowniczy.obserwator;

/**
 *
 * @author Pawel
 */
public class B_Obserwator implements Obserwator{

    private Budowniczy budowniczy;
   
    public B_Obserwator(Budowniczy budowniczy){
        this.budowniczy = budowniczy;
    }
    
    @Override
    public void update(String message) {
        System.out.println(message);
    }
    
}
