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
public class CompressionContext {
    private CompressionStrategy strategy;
    
    public void setStrategy(CompressionStrategy strategy){
        this.strategy = strategy;
    }
    public void wykonaj(ArrayList<File> files){
        strategy.compressFile(files);
    }
}
