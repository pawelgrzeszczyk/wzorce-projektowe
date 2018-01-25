/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_mediator2;

import java.util.ArrayList;

/**
 *
 * @author Pawel
 */
public class MediatorCentrala implements Mediator{
    
    private ArrayList<User> uzytkownicy = new ArrayList();
    
    public void dodajUzytkownika(User user){
        uzytkownicy.add(user);
    }
    public void usunUzytkownika(User user){
        int id = uzytkownicy.indexOf(user);
        uzytkownicy.remove(id);
    }

    @Override
    public void sendMessage(String message) {
        for(User u:uzytkownicy)
            u.receiveMessage(message);
    }
    
}
