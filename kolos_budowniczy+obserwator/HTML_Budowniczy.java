/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_budowniczy.obserwator;

import java.util.ArrayList;

/**
 *
 * @author Pawel
 */
public class HTML_Budowniczy implements Budowniczy{

    private String title, body, message;
    private ArrayList<Obserwator> obserwatorzy = new ArrayList();
    
    
    @Override
    public void budujTitle(String parametr) {
        this.title = "<title>"+parametr+"</title>";
    }

    @Override
    public void budujBody(String parametr) {
        this.body = "<body>"+parametr+"</body>";
        this.message = "building body";
        powiadomObserwatorow();

    }

    @Override
    public String budujCalosc() {
        return title+"\n"+body;
    }

    @Override
    public void dodajObserwatora(Obserwator obserwator) {
        obserwatorzy.add(obserwator);
    }

    @Override
    public void usunObserwatora(Obserwator obserwator) {
        int id = obserwatorzy.indexOf(obserwator);
        obserwatorzy.remove(id);
    }

    @Override
    public void powiadomObserwatorow() {
        for(Obserwator o:obserwatorzy)
            o.update(message);
    }

   
    
}
