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
public class Kolos_adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AudioPlayer a = new AudioPlayer();
        
        a.Play("mp3", "doda.mp3");
        a.Play("mp4", "name.mp4");
        a.Play("vlc", "Film.vlc");
        a.Play("avi", "name.avi");
        
    }
    
}
