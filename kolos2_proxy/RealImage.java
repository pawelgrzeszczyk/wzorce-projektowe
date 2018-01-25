/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_proxy;

/**
 *
 * @author Pawel
 */
public class RealImage implements Image{
    private String filename;
    
    public RealImage(String filename){
        this.filename = filename;
        load(filename);
        
    }

    @Override
    public void Display() {
        System.out.println("Display file: "+filename);
    }
    
    public void load(String filename){
        System.out.println("load image: "+filename);
    }
    
    
}
