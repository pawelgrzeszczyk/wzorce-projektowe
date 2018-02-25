/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_strategia2;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Pawel
 */
public class Kolos_strategia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<File> files = new ArrayList();
        
        CompressionContext context = new CompressionContext();
        context.setStrategy(new Zip());
        context.wykonaj(files);
    }
    
}
