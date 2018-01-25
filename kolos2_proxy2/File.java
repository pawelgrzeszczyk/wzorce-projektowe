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
public class File{

   
    private String nazwa;
    private int rozmiar;
    private String rozszerzenie;
    
    public File(String nazwa, int rozmiar, String rozszerzenie){
        this.nazwa = nazwa;
        this.rozmiar = rozmiar;
        this.rozszerzenie = rozszerzenie;
    }
    

    public String getRozszerzenie() {
        return rozszerzenie;
    }

    public String getNazwa() {
        return nazwa;
    }
    
}
