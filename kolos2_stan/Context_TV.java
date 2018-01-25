/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_stan;

/**
 *
 * @author Pawel
 */
public class Context_TV implements Stan{

    private Stan current;
    
    public Context_TV(){
        current = null;
    }
    
    public void setStan(Stan current){
        this.current = current;
    }
    
    public Stan getStan(){
        return current;
    }
    
    
    @Override
    public void doAction() {
        this.current.doAction();
    }
    
}
