/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_proxy2;

import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Pawel
 */
public class ProxyFile implements FileAbstract{
    
    private List<File> listaPlikow;
    private FileAbstract files;
    private List<File> listaDobrych = new ArrayList();
  
    
    public ProxyFile(FileAbstract files){
        listaPlikow = new ArrayList();
        this.files = files;
    }
    
   
    @Override
    public List getListaPlikow() {
        listaPlikow = files.getListaPlikow();
        for(File f:listaPlikow)
            if(f.getRozszerzenie().equalsIgnoreCase("jpg"))
                listaDobrych.add(f);
            else continue;
        
        return listaDobrych;
    }

    @Override
    public void add(File file) {
        listaDobrych.add(file);
    }

    @Override
    public void print() {
        this.getListaPlikow();
        for(File f:listaDobrych)
            System.out.println(f.getNazwa());
        
    }
    
}
