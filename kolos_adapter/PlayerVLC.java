/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_adapter;

/**
 *
 * @author Pawel
 */
public class PlayerVLC implements AdvancePlayer{

    @Override
    public void vlcPlayer(String name) {
        System.out.println("Play video: "+name);
    }

    @Override
    public void mp3Player(String name) {
        
    }
    
}
