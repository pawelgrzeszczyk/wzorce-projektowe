/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_budowniczy.obserwator;

/**
 *
 * @author Pawel
 */
public interface Budowniczy {
    
    public void budujTitle(String parametr);
    public void budujBody(String parametr);
    public String budujCalosc();
    
    public void dodajObserwatora(Obserwator obserwator);
    public void usunObserwatora(Obserwator obserwator);
    public void powiadomObserwatorow();
    
    
}
