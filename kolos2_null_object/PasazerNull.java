/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_null_object;

/**
 *
 * @author Pawel
 */
public class PasazerNull extends PasazerAbstract{

    public PasazerNull(){
        
    }
    
    
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return null;
    }
    
}
