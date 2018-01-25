/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_proxy2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pawel
 */
public class Files implements FileAbstract{
    
    private List<File> listaPlikow;
    
    public Files(){
        listaPlikow = new ArrayList();
    }
    public void add(File file){
        listaPlikow.add(file);
    }

    @Override
    public List getListaPlikow() {
        return listaPlikow;
    }

    @Override
    public void print() {
        for(File f:listaPlikow)
            System.out.println(f.getNazwa());
    }
    
}
