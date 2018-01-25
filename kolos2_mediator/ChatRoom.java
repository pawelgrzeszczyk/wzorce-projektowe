/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_mediator;

/**
 *
 * @author Pawel
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println("user: "+user.getName()+", message: "+message);
    }
}
