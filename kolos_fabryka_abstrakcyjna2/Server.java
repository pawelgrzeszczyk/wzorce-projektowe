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
public class Server extends Komputer{

    private String cpu,hdd,gpu;

    public Server(String cpu, String hdd, String gpu) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.gpu = gpu;
    }
    
    
    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getGPU() {
        return this.gpu;
    }
    
}
