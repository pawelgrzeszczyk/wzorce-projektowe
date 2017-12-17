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
public class Adapter implements MediaPlayer{
    AdvancePlayer adwanceplayer;
    
    public Adapter(String audioType){
        if(audioType.equalsIgnoreCase("mp3")){
            adwanceplayer = new PlayerMP3();
        }
        else if(audioType.equalsIgnoreCase("vlc")){
            adwanceplayer = new PlayerVLC();
        }
    }
    
    @Override
    public void Play(String AudioType, String name) {
        if(AudioType.equalsIgnoreCase("mp3")){
            adwanceplayer.mp3Player(name);
        }else if(AudioType.equalsIgnoreCase("vlc")){
            adwanceplayer.vlcPlayer(name);
        }
    }
    
}
