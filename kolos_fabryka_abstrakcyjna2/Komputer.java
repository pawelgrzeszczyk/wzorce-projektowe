/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos_fabryka_abstrakcyjna2;

/**
 *
 * @author Pawel
 */
public abstract class Komputer {
    
    public abstract String getCPU();
    public abstract String getHDD();
    public abstract String getGPU();
    
    @Override
    public String toString(){
        return "CPU="+this.getCPU()+" HDD="+this.getHDD()+" GPU="+this.getGPU();
    }
    
}
