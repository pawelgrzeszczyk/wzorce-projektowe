/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_prototyp;

/**
 *
 * @author Pawel
 */
public class Samochod implements Prototyp{
    
   public Samochod(){
       System.out.println("Jestem wzorcem");
   }

    @Override
    public Prototyp clone() {
        Samochod samochod = null;
        
        try{
            System.out.println("Jestem klonem");
            samochod = (Samochod) super.clone();
            
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return samochod;
    }
    
    
}
    
    

