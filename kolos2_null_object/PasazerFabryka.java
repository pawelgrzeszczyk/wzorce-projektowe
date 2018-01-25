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
public class PasazerFabryka {
 
    public String[] pasazerowie = {"andrzej", "marek", "rafal"};

    
    
    public PasazerAbstract getPasazer(String name){
        for(int i=0; i<pasazerowie.length; i++){
            if(pasazerowie[i].equals(name))
                return new Pasazer(name);
        }
        return new PasazerNull();
        
    }
}
