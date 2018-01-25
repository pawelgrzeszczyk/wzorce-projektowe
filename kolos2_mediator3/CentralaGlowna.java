/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_mediator3;

import java.util.ArrayList;

/**
 *
 * @author Pawel
 */
public class CentralaGlowna implements CentralaMediator{
    
    private ArrayList<User> uzytkownicy = new ArrayList();
    
    public void dodajUsera(User user){
        uzytkownicy.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User u:uzytkownicy){
            if(u != user)
                user.recive(message);
        }
    }
    
}
