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
public class Zip implements CompressionStrategy{

    @Override
    public void compressFile(ArrayList<File> files) {
        System.out.println("zip");
    }
    
}
