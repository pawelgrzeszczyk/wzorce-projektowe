/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozyt.memento;

/**
 *
 * @author Matje
 */
public interface Kompozyt_drzewo {
     void add(Kompozyt_drzewo k);
     void zmien(String klucz, String wartosc);
     void cofnij(String klucz);
     Kompozyt_drzewo getChild(int i);
     String getWartosc();
     String getKlucz();
     void setWartosc(String wartosc);
     void print();
     void wyswietl_poprzedni_stan();
     
    
}
