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
public class ProxyImage implements Image{

    private String filename;
    private RealImage realImage;
    
    public ProxyImage(String filename){
        this.filename = filename;
    }
    
    @Override
    public void Display() {
        if(realImage == null)
                realImage = new RealImage(filename);
        realImage.Display();
    }
    
}
