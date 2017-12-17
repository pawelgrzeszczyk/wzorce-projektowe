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
public class AudioPlayer implements MediaPlayer{
    private Adapter adapter;
    
    @Override
    public void Play(String AudioType, String name) {
        if(AudioType.equalsIgnoreCase("mp3") || AudioType.equalsIgnoreCase("vlc")){
            adapter = new Adapter(AudioType);
            adapter.Play(AudioType, name);
            
        }
        else if(AudioType.equalsIgnoreCase("mp4")){
            System.out.println("Play music: "+name);
       }
        else
            System.out.println("Niewlaściwy format");
    
}
}