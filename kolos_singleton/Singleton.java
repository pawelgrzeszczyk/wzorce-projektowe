/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_singleton;

/**
 *
 * @author Pawel
 */
public class Singleton {
    
    private static Singleton newInstance = null;
    
    public static Singleton getInstance(){
        if(newInstance == null){
            newInstance = new Singleton();
        }
        return newInstance;
    }
    
}
