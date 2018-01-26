/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozyt.wizytator;

/**
 *
 * @author Pawel
 */
public class KompozytWizytator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Wizytator w = new WizytatorStruktury();
        
        KatalogKompozyt folder1 = new KatalogKompozyt("folder");
        PlikLisc plik = new PlikLisc("plik");
        PlikLisc plik2 = new PlikLisc("plik2");
        folder1.dodaj(plik);
        folder1.dodaj(plik2);
        folder1.wyswietl();
        System.out.println(folder1.zliczaj(w));
        
    }
    
}
