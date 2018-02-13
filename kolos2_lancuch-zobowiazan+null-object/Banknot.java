/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

/**
 *
 * @author Marcin
 */
public class Banknot {
    private float wartosc;
    private String waluta;

    public Banknot(float wartosc, String waluta) {
        this.wartosc = wartosc;
        this.waluta = waluta;
    }

    public float getWartosc() {
        return wartosc;
    }

    public String getWaluta() {
        return waluta;
    }
    
    
}
