/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_stan2;

/**
 *
 * @author Pawel
 */
public class Context implements Stan{
    private Stan stanCurrent;
    
    public Context(){
        stanCurrent = null;
    }
    
    public void setStan(Stan stanCurrent){
        this.stanCurrent = stanCurrent;
    }
    public Stan getStan(){
        return stanCurrent;
    }

    @Override
    public void doAction() {
        this.stanCurrent.doAction();
    }
    
    
}
