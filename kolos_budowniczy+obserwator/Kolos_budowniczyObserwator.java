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
public class Kolos_budowniczyObserwator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dyrektor dyrektor = new Dyrektor();
        Budowniczy html = new HTML_Budowniczy();
        Obserwator obserwator = new B_Obserwator(html);
        
        html.dodajObserwatora(obserwator);
        html.usunObserwatora(obserwator);
        dyrektor.setBudowniczy(html);
        System.out.println(dyrektor.skladaj());
        
        
    }
    
}
