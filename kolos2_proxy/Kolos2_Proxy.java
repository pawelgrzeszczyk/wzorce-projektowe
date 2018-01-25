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
public class Kolos2_Proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Image image = new ProxyImage("abc.jpg");
        image.Display();
    }
    
}
