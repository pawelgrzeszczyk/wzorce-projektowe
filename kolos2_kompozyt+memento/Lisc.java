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
public class Lisc implements Kompozyt_drzewo{
    
    String wartosc;
    String klucz;

    public Lisc(String wartosc, String klucz) {
        this.wartosc = wartosc;
        this.klucz = klucz;
    }
    

    @Override
    public void add(Kompozyt_drzewo k) {
        System.out.println("To jest liść, ostatni element");
    }

    @Override
    public void zmien(String klucz, String wartosc) {
    }

    @Override
    public void cofnij(String klucz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Kompozyt_drzewo getChild(int i) {
        System.out.println("To jest ostatni element");
        return null;
    }

    @Override
    public String getWartosc() {
        return this.wartosc;
                
    }

    @Override
    public void setWartosc(String wartosc) {
        this.wartosc=wartosc;
        
    }

    @Override
    public String getKlucz() {
        return this.klucz;
    }

    @Override
    public void print() {
        System.out.println("-------------");
        System.out.println("Name =" + this.getWartosc());
        System.out.println("-------------");
    }

    @Override
    public void wyswietl_poprzedni_stan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
