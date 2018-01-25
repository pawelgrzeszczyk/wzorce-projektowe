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
public class Pasazer extends PasazerAbstract{
    private String name;
    
    
    public Pasazer(String name){
        this.name = name;
    }
    
    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
