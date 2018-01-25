/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2_proxy2;

/**
 *
 * @author Pawel
 */
public class Kolos2_proxy2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileAbstract files =  new Files();
        File plik1 = new File("obraz",15,"jpg");
        File plik2 = new File("obraz_inny", 12, "png");
        files.add(plik1);
        files.add(plik2);
        files.print();
        FileAbstract proxy = new ProxyFile(files);
        proxy.print();
        
    }
   
}
